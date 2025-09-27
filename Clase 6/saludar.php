<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form method="get">
        <input type="text" name="nombre" placeholder="Escribe tu nombre"><br>
        <input type="number" name="edad" placeholder="Escribe tu edad"><br>
        <input type="submit" value="Saludar">
        <?php
            if(isset($_GET["nombre"]) && $_GET["nombre"] != "" && isset($_GET["edad"]) && $_GET["edad"] != ""){
                $nombre = $_GET["nombre"];
                $edad = $_GET["edad"];
                echo "<h1 style='color:blue'>Hola, $nombre! Tienes $edad años.</h1>";
            }else{
                echo "<h1 style='color:red'>Por favor, completa tu nombre y edad.</h1>";
            }
        ?>
        
    </form>
</body>
</html>