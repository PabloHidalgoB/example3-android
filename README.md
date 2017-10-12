# Aplicacion de ejemplo 3 - Android

Este projecto es referente a lo basico de List View, implementando una variada seleccion de objetos tales como Layouts, Fragments, 
TextViews entre otros, la finalidad de esta aplicacion se basa en la seleccion de datos de un ListView y combinarlo con los datos 
presentes en un fragment para enviarlos a otra actividad en formato JSON

<img src="https://github.com/PabloHidalgoB/example3-android/blob/master/app/src/main/res/screenshots/main.png" data-canonical-src="https://github.com/PabloHidalgoB/example3-android/blob/master/app/src/main/res/screenshots/main.png" width="200" height="auto" />

Cuando se inicia la aplicacion, el usuario se encuentra con este tipo de pantalla, puede que no parezca demasiado pero en esta actividad 
se manejan 2 fragments, 1 clase adaptadora de datos para que se pueda llenar la lista que se muestra, entregando una posicion al mismo 
tiempo, ya que servira al programa para indicar desde donde los datos deben ser tomados

Cuando se selecciona una entrada de la lista, el Fragment encargado de la lista se ocupa de obtener los datos de dicha entrada y al mismo 
tiempo rescata los datos de la persona que se muestra en el Fragment de "Datos Persona" a travez del MainActivity, convirtiendo el los 
datos de persona que esta en JSON a string, de esta forma invoca a una nueva activity llamada DetailActivity donde estos datos son 
rescatados y decodificados para ser trabajado de una manera mas manejable, de la misma forma este activity se encarga desplegar los datos 
de la persona seleccionada y su direccion, desplegandola de la siguiente forma 

<img src="https://github.com/PabloHidalgoB/example3-android/blob/master/app/src/main/res/screenshots/activity.png" data-canonical-src="https://github.com/PabloHidalgoB/example3-android/blob/master/app/src/main/res/screenshots/activity.png" width="200" height="auto" />
