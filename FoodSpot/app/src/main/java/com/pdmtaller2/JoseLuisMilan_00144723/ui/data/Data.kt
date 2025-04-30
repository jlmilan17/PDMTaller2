package com.pdmtaller2.JoseLuisMilan_00144723.ui.data


data class Dish(
    val id: String,
    val name: String,
    val description: String,
    val imageUrl: String
)

data class Restaurant(
    val id: String,
    val name: String,
    val category: String,
    val imageUrl: String,
    val description: String,
    val menu: List<Dish>
)

val restaurants = listOf(
    // Restaurantes existentes
    Restaurant(
        id = "1",
        name = "Burger House",
        category = " Comida Rápida",
        imageUrl = "https://images.unsplash.com/photo-1550547660-d9450f859349",
        description = "Hamburguesas artesanales con ingredientes frescos.",
        menu = listOf(
            Dish(
                id = "d1",
                name = "Hamburguesa Clásica",
                description = "Carne 100% res, lechuga, tomate, mayonesa.",
                imageUrl = "https://images.unsplash.com/photo-1550547660-d9450f859349"
            ),
            Dish(
                id = "d2",
                name = "Hamburguesa con Queso",
                description = "Con doble queso cheddar y papas.",
                imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd"
            ),
            Dish(
                id = "d21",
                name = "Hamburguesa Vegetariana",
                description = "Medallón de lentejas, champiñones y espinacas con aguacate.",
                imageUrl = "https://images.unsplash.com/photo-1520072959219-c595dc870360"
            ),
            Dish(
                id = "d22",
                name = "Papas Deluxe",
                description = "Papas fritas con queso cheddar, tocino y cebolla caramelizada.",
                imageUrl = "https://images.unsplash.com/photo-1576107232684-1279f390859f"
            )
        )
    ),
    Restaurant(
        id = "r2",
        name = "Taco Fiesta",
        category = " Comida Mexicana",
        imageUrl = "https://images.unsplash.com/photo-1552332386-f8dd00dc2f85",
        description = "Tacos, burritos y nachos al estilo mexicano.",
        menu = listOf(
            Dish(
                id = "d3",
                name = "Taco de Pastor",
                description = "Tortilla de maíz, carne al pastor, piña.",
                imageUrl = "https://plus.unsplash.com/premium_photo-1681406994530-3de7406c21a5"
            ),
            Dish(
                id = "d23",
                name = "Nachos Fiesta",
                description = "Nachos con queso fundido, jalapeños, guacamole y crema.",
                imageUrl = "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d"
            ),
            Dish(
                id = "d24",
                name = "Quesadilla Suprema",
                description = "Tortilla de harina con queso, pollo, pimientos y cebolla.",
                imageUrl = "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f"
            )
        )
    ),
    Restaurant(
        id = "r5",
        name = "Pizza Palace",
        category = " Comida Italiana",
        imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGl6emF8ZW58MHx8MHx8fDA%3D",
        description = "Pizzas artesanales con masa fina y toppings frescos.",
        menu = listOf(
            Dish(
                id = "d9",
                name = "Pizza Margarita",
                description = "Tomate, mozzarella y albahaca fresca.",
                imageUrl = "https://media.istockphoto.com/id/1733415256/es/foto/justo-encima-de-la-pizza-margherita-reci%C3%A9n-horneada-con-albahaca-y-mozzarella.webp?a=1&b=1&s=612x612&w=0&k=20&c=cGndzy7r8qG3nKLn1BRNjUZ3IDBL5v4r2USObsi90uY="
            ))),
    Restaurant(
        id = "r3",
        name = "Pasta Bella",
        category = " Comida Italiana",
        imageUrl = "https://media.istockphoto.com/id/1501120013/es/foto/la-ensalada-caprese-se-aceita-con-aceite-de-oliva.webp?a=1&b=1&s=612x612&w=0&k=20&c=HTcMTLgyt8YRwWvTNuv-hF8hy6byUn7hdVORQY_evIE=",
        description = "Especialistas en pastas y lasañas caseras.",
        menu = listOf(
            Dish(
                id = "d5",
                name = "Espaguetis Boloñesa",
                description = "Con salsa de carne y parmesano.",
                imageUrl = "https://images.unsplash.com/photo-1516100882582-96c3a05fe590"
            ),
            Dish(
                id = "d6",
                name = "Lasaña Tradicional",
                description = "Capas de pasta, carne, queso y salsa de tomate.",
                imageUrl = "https://images.unsplash.com/photo-1614961908593-2c6bf2bdf2ba"
            ),
            Dish(
                id = "d25",
                name = "Pizza Margherita",
                description = "Base crujiente con salsa de tomate, mozzarella y albahaca.",
                imageUrl = "https://images.unsplash.com/photo-1574071318508-1cdbab80d002"
            ),
            Dish(
                id = "d26",
                name = "Risotto de Hongos",
                description = "Arroz arbóreo con variedad de hongos y queso parmesano.",
                imageUrl = "https://images.unsplash.com/photo-1476124369491-e7addf5db371"
            )
        )
    ),
    Restaurant(
        id = "r4",
        name = "Sushi Zen",
        category = " Comida Asiática",
        imageUrl = "https://media.istockphoto.com/id/1616721452/es/foto/personas-an%C3%B3nimas-almorzando-con-sushi.webp?a=1&b=1&s=612x612&w=0&k=20&c=TfO7i9e4d-SCsTYfVtwnPwgalWodTAO0VqS_tmGxp_c=",
        description = "Sushi, ramen y comida japonesa auténtica.",
        menu = listOf(
            Dish(
                id = "d7",
                name = "Sushi Maki",
                description = "Rollo de arroz, salmón y aguacate.",
                imageUrl = "https://media.istockphoto.com/id/497022342/es/foto/plato-de-sushi-del-restaurante-japon%C3%A9s.webp?a=1&b=1&s=612x612&w=0&k=20&c=9YNWlbMXezf09n1H_XTgOTVULFyEUWty2B2hlFN4Dns="
            ),
            Dish(
                id = "d8",
                name = "Ramen de Cerdo",
                description = "Fideos japoneses en caldo con cerdo y huevo.",
                imageUrl = "https://media.istockphoto.com/id/2064521882/es/foto/soy-sauce-ramen.webp?a=1&b=1&s=612x612&w=0&k=20&c=ynapJvjcpXZ0XmfBQoBl3SxrvSA53UrInlnl8B1048U="
            ),
            Dish(
                id = "d27",
                name = "Gyozas de Pollo",
                description = "Empanadillas japonesas rellenas de pollo y verduras.",
                imageUrl = "https://media.istockphoto.com/id/803171476/es/foto/empanadillas-gyoza-2.webp?a=1&b=1&s=612x612&w=0&k=20&c=OmecQIF2Fsz16h-NKEjahE8AkgdRP6kElJsox6ebXbY="
            ),
            Dish(
                id = "d28",
                name = "Tempura Mixta",
                description = "Fritura ligera de mariscos y verduras con salsa tentsuyu.",
                imageUrl = "https://images.unsplash.com/photo-1615361200098-9e630ec29b4e"
            )
        )
    ),

    Restaurant(
        id = "r6",
        name = "Green Garden",
        category = " Saludable",
        imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd",
        description = "Opciones frescas y nutritivas con ingredientes orgánicos.",
        menu = listOf(
            Dish(
                id = "d13",
                name = "Buddha Bowl",
                description = "Quinoa, aguacate, garbanzos, espinacas y aderezo de tahini.",
                imageUrl = "https://images.unsplash.com/photo-1546069901-ba9599a7e63c"
            ),
            Dish(
                id = "d14",
                name = "Ensalada Mediterránea",
                description = "Mix de lechugas, tomate, pepino, aceitunas y queso feta.",
                imageUrl = "https://images.unsplash.com/photo-1540189549336-e6e99c3679fe"
            ),
            Dish(
                id = "d15",
                name = "Wrap de Hummus",
                description = "Tortilla integral con hummus, vegetales asados y aguacate.",
                imageUrl = "https://images.unsplash.com/photo-1626700051175-6818013e1d4f"
            ),
            Dish(
                id = "d16",
                name = "Smoothie Bowl",
                description = "Base de açaí con plátano, frutos rojos y granola casera.",
                imageUrl = "https://images.unsplash.com/photo-1577805947697-89e18249d767"
            )
        )
    ),
    Restaurant(
        id = "r7",
        name = "Delhi Spice",
        category = " Comida India",
        imageUrl = "https://images.unsplash.com/photo-1585937421612-70a008356fbe",
        description = "Auténticos sabores de la India con especias tradicionales.",
        menu = listOf(
            Dish(
                id = "d17",
                name = "Butter Chicken",
                description = "Pollo en salsa cremosa de tomate con especias y mantequilla.",
                imageUrl = "https://images.unsplash.com/photo-1603894584373-5ac82b2ae398"
            ),
            Dish(
                id = "d18",
                name = "Samosas Vegetarianas",
                description = "Empanadas rellenas de papa, guisantes y especias.",
                imageUrl = "https://images.unsplash.com/photo-1601050690597-df0568f70950"
            ),
            Dish(
                id = "d19",
                name = "Naan de Ajo",
                description = "Pan tradicional horneado con mantequilla de ajo.",
                imageUrl = "https://images.unsplash.com/photo-1617692855027-33b14f061079"
            )
        )
    )
)