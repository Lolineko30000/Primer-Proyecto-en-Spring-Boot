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
            

            
        }

    }).mount('#app')
})