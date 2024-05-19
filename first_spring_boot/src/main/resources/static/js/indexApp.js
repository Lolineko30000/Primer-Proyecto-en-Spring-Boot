$(() => {

    axios.defaults.headers.post["X-Requested-With"] = "XMLHttpRequest";
    const { createApp } = Vue

    createApp({

        data() {
            return {
                responded: false,

            }
        },

        created: function () {},

        methods: {
            
            deleteGame:function (id) {
                fetch('/games/delete/' + id, {
                    method: 'POST'
                })
                    .then(response => {
                        if (!response.ok) {
                            throw new Error('Failed to delete game');
                        }
                        console.log('Game deleted successfully');
                    })
                    .catch(error => console.error('Error:', error));
            },


            updateGame: function (id, updatedScore) {
                fetch('/games/update/' + id, {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: updatedScore
                })
                    .then(response => {
                        if (!response.ok) {
                            throw new Error('Failed to update game');
                        }
                        console.log('Game updated successfully');
                    })
                    .catch(error => console.error('Error:', error));
            },


            addNewGame: function (newGame) {
                fetch('/games/addNewGame', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(newGame)
                })
                    .then(response => {
                        if (!response.ok) {
                            throw new Error('Failed to add new game');
                        }
                        console.log('New game added successfully');
                    })
                    .catch(error => console.error('Error:', error));
            },
            

            sendConfirmationEmail: function () {
                var email = document.getElementById('registrationEmail').value;
            
                // Make AJAX request to send confirmation email
                $.ajax({
                    type: 'POST',
                    url: '/send-confirmation-email',
                    contentType: 'application/json',
                    data: JSON.stringify({ email: email }),
                    success: function (response) {
                        alert('Confirmation email sent successfully!');
                    },
                    error: function (xhr, status, error) {
                        alert('Error sending confirmation email: ' + error);
                    }
                });
            }
            
        }
    }).mount('#app')
})