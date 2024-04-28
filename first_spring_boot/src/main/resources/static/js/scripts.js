// Function to delete a game
function deleteGame(id) {
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
}

// Function to update a game
function updateGame(id, updatedScore) {
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
}

// Function to add a new game
function addNewGame(newGame) {
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
}
