
App for viewing list of poke from https://pokeapi.co. There are two screens, list of pokes and detail screen.  
Main fragment showing list of pokes, with abilities click to item and look him details info.  
Detail fragment showing: hp, attack, defence, speed, types, height, weight, stats.  
  
Sorted function realized in the following way - given 3 checkBox (hp, attack, defence):  
- in case choose one parameters, list is sorted by him;  
- in case choose several parameters, I simply summing all types parameters, for understand who of poke most strenght);

Architecture app (MVVM):  

  
Single Activity  
Two fragments  
View model factory  
Two view models, for each fragment  
Dao interface  
Room database  
   
   ====================
  
Implemented:

Navigation architecture  
ViewModel  
Retrofit 2  
Dagger 2  
Coroutines  
LiveData  
Room  
Landscape layouts
