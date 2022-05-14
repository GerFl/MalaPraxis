// Iniciamos la app de Vue
var app = new Vue({
    // Indicamos el nombre del elemento que va a buscar en el DOM
    el: ('#app'),
    // Declaramos los datos. Puedes verlo como la informacion que trajiste de un query
    // y vas a imprimir en la pagina
    data: {
        product: 'This shit reactive',
        description: "This supposed to be a description",
        image: './assets/vmSocks-green-onWhite.jpg',
        link: 'https://www.reddit.com',
        inStock: false,
        inventory: 10,
        onSale: true,
        details: ["80% cotton", "20% polyester", "Gender-neutral"],
        variants: [{
                variantId: 2234,
                variantColor: "green",
                variantImage: './assets/vmSocks-green-onWhite.jpg'
            },
            {
                variantId: 2235,
                variantColor: "blue",
                variantImage: './assets/vmSocks-blue-onWhite.jpg'
            }
        ],
        sizes: ["Small", "Medium", "Large"],
        cart: 0
    },
    // Asi como podemos declarar datos, podemos declarar metodos
    methods: {
        // Esta pequeña funcion toma el objeto actual (cart) y lo aumenta +1
        addToCart: function() {
            this.cart += 1
        },
        // Recibimos la imagen de la variante como parametro, y cambiamos el atributo de image
        // en nuestro data por este variantImage
        updateProduct: function(variantImage) {
            this.image = variantImage
        },
        removeFromCart() {
            this.cart -= 1
        }
    }
});