/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

/**
 *
 * @author Adriana
 */
public enum Scene {
    
    JFK_Airport("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| JFK Airport                                                                                                          |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n You have arrived at the John F Kennedy Airport (JFK) is the busiest of New York's three airport. There are millions of "
            + "\n passengers heading to or arriving from domestic and international destinations every year here. Today is a beautiful   "
            + "\n day, and there are many people passing by, some in a hurry and some looking for someone to who could guide them out of "
            + "\n this madness. You ran to get into one of the AirTrain and isheading out to your hotel. A person next to you engages in "
            + "\n a conversation.                                                                                                        "),
    
    Time_Square("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Time Square                                                                                                          |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n Times Square displays of lights and digital signs is impressive even during the daytime. It is a major commercial      "
            + "\n intersection and neighborhood in Midtown Manhattan, New York City, at the junction of Broadway and Seventh Avenue.     "
            + "\n There are people everywhere, some enjoying the day eating ouside, others are in line to by tickes for tonight's shows  "
            + "\n shows other's are waiting for the free entertainment about to start, and others are just trying to take all in as you  "
            + "\n do. As you watch people passing by, a person stops by your side and starts a conversation.                             "),
    
    Central_Park("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Central Park                                                                                                         |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n You find yourself walking into Central Park, the famous urban park in the central part of Manhattan. In this beautiful,"
            + "\n sunny, warm day, the park offers a cool and quite place to sit and enjoy the beautiful scene. There are people         "
            + "\n everywhere sitting on benches, in the grass, and in the half-walls by the sidewalks. As you are sitting on the wall, a "
            + "\n person nearby strikes a conversation.                                                                                  "),
    
    NY_Subway("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| NYC Subway                                                                                                           |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n You are about to enter the New York City Subway. It  is the largest, by number of stations, and one of the world's .   "
            + "\n oldest, most used public transit systems Thousands of people travel in them daily. New Yorkers are not famous for      "
            + "\n neighbourly conversation. However, a nearby passenger starts to talk to you.                                           "),
    
    Chinatown("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Chinatown                                                                                                            |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n Chinatown is a neighborhood in Manhattan that is home to the largest enclave of Chinese people in the Western          "
            + "\n Hemisphere. It looks, feels and smells different. The Chinese culture is present in every aspect, from the number of   "
            + "\n street, to the open market feel of food and products people walking on the sold on the sidelines. Even the trafic      "
            + "\n signs are written in both Chinese and English. It is a experience in the middle of lower Manhathan.                    "),
    
    Little_Italy("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Little Italy                                                                                                         |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n Little Italy is a neighborhood in lower Manhattan, once known for its large population of Italians. Today the          "
            + "\n neighborhood consists of only a few Italian stores and restaurants. Little Italy residents have seen organized crime   "
            + "\n since the early 1900s. Powerful nmembers of the Italian Mafia operated in Little Italy. But that is not the case       "
            + "\n anymore. So when a stranger approches, you don't feel too anxious.                                                     "),
    
    Metropolitan_Museum_of_Art("\n"
            + "\n--------------------------------------------------------------------------------------------------------------------------"
            + "\n| Metropolitan Museum of Art                                                                                             |"
            + "\n--------------------------------------------------------------------------------------------------------------------------"
            + "\n The Metropolitan Museum of Art is the largest art museum in the United States and one of the ten largest in the world.   "
            + "\n Its permanent collection contains more than two million works. Represented in the permanent collection are works of art  "
            + "\n classical antiquity and Ancient Egypt, paintings and sculptures from nearly all the European masters, and an from        "
            + "\n extensive collection of American and modern art. The Met also maintains extensive holdings of African, Asian, Oceanic,   "
            + "\n Byzantine, and Islamic art. After afew minutes observing the art, a nearby observer aproches and quietly begins to speak."),
    
    Broadway("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Broadway                                                                                                             |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n Broadway is widely known as the heart of the American theater industry, and also refers to the theatrical performances "
            + "\n presented in the 40 professional theaters with 500 or more seats. I is located in the Theater District and Lincoln     "
            + "\n Center along Brodway. It influences popular culture and helps New York City be the cultural capital of the nation.     "
            + "\n While in line to buy tickets, the person behind you starts talking to you.                    S                         "),
    
    Lincoln_Center("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Lincoln Center                                                                                                       |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n The Lincoln Center of Performing Arts is a complex of several buildings. The center of the plaza has 30 indoor and     "
            + "\n outdoor performance facilities. One of the eleven residential organizations serves three primary roles: presents       "
            + "\n artistic programming, is the national leader in arts, education, and community relations,along with managing the       "
            + "\n center's campus. As the world's largest presenter of performing arts, offering nsome 5,000 programs, initiatives and   "
            + "\n events as the Emmy Award.                                                                                              "),
    
    Grand_Central_Station("\n"
            + "\n--------------------------------------------------------------------------------------------------------------"
            + "\n| Grand Central Station                                                                                      |"
            + "\n--------------------------------------------------------------------------------------------------------------"
            + "\n Grand Central Station is a commuter railroad terminal in Midtown Manhattan. It covers 48 acres, has 44       "
            + "\n platforms, more than any other railroad station in the world. Features both monumental and meticulously      "
            + "\n rafted detail, historian David Cannadine described it one of the most majestic buildings of the twentieth    "
            + "\n entury. It's the sixth-most-visited tourist attraction for its roughly 21.6 million annual visitors.         "),
    
    Statue_of_Liberty("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Statue of Liberty                                                                                                    |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n The Statue of Liberty is a colossal neoclassical sculpture on Liberty Island in New York Harbor. The statue is an icon "
            + "\n of the United States and its freedom, and was a welcoming sight to immigrants arriving from  abroad. Seeing it in      "
            + "\n person is a memorable experience.                                                                                      "),
    
    Hudson_River("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Hudson River                                                                                                         |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n The Hudson River flows north to south and eventually drains into the Atlantic Ocean, between New York City and Jersey  "
            + "\n City. The Hudson River has been a vital artery in New York's history, an essential tool for travel, transport, survival"
            + "\n and inspiration for generations. It provides an amazing view. The sun seems to rest on the sparkling river, allowing   "
            + "\n you tofully appreciate Manhattan Island.                                                                               "),
    
    Chelsea_Market("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Chelsea Market                                                                                                       |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n The Chelsea Market is an enclosed urban food court, shopping mall, and office building in the Chelsea neighborhood of  "
            + "\n Manhattan. This unique place's shops and restaurants give you vast selections of goods. Great eateries and historic    "
            + "\n buildings surround you. You're granted easy access to Highline Park. Nature's plant life calls for attention, splashes "
            + "\n of color springing up everywhere you look. At this point, it feels like your in a world seperate from New York.        "),
    
    Brooklyn_Bridge("\n"
            + "\n----------------------------------------------------------------------------------------------------------------------------"
            + "\n| Brooklyn Bridge                                                                                                          |"
            + "\n----------------------------------------------------------------------------------------------------------------------------"
            + "\n One of the oldest bridges in New York is the Brooklyn Birdge. Walking on this bridge from Brooklyn to Manhattan is very    "
            + "\n pleasureable. Loads of photo opportunities and views are presented throughout you're walk. Brooklyn bridge is and has been "
            + "\n an engineering marvel for ages. Smiling faces, laughter and joy surround you, and you can't help but take part in that.    "),
    
    Soho("\n"
            + "\n-------------------------------------------------------------------------------------------------------------------------"
            + "\n| Soho                                                                                                                  |"
            + "\n-------------------------------------------------------------------------------------------------------------------------"
            + "\n Soho refers to the area being South of Houston Street. Soho is the welcome home for high end shopping, cool restaurants,"
            + "\n and maybe even a little celebrity-gawking. The area's history is an archetypal example of inner-city regeneration,      "
            + "\n which includes the SoHo-Cast Iron Historic District. SoHo is known for its commercialization and eclectic mix of        "
            + "\n shopping boutiques.                                                                                                     "),
    
    Empire_State_Building("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Empire State Building                              |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nThe Empire State Building is generally thought of as  "
            + "\nan American cultural icon. It is designed in the      "
            + "\ndistinctive Art Deco style and has been named as one  "
            + "\nof the Seven Wonders of the Modern World. Paying      "
            + "\nattention to the decor, enlarged photographs and      "
            + "\narticles, you make your way to the breath-taking      "
            + "\nview on the sky deck. There is a lot of history to    "
            + "\nbe absorbed through these, the whole feel of it adding"
            + "\nto the romantic view of NYC. The observation deck is  "
            + "\nbreathtaking.                                         "),
    
    Rockefeller_Center("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Rockefeller Center                                 |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nYou're standing at the top of the Rock at             "
            + "\nRockefeller Center in the G.E. Building.  Incredible  "
            + "\nviews of Central Park and the island expose themselves"
            + "\nSome say the best sightseeing in NY is right in front "
            + "\nof you. Outside is the famous ice skating rink and    "
            + "\nChristmas tree in the winter. Unusual, unexpected and "
            + "\nalways exciting, Rockefeller Center is home to some of"
            + "\nNew York City's most spectacular, talked-about events."),
    
    Ellis_Island("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Ellis Island                                       |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nEllis Island was the gateway for millions of          "
            + "\nimmigrants to get into the United States. As the      "
            + "\nnation's busiest immigrant inspection station from    "
            + "\n1892 until 1954, the Main Building now houses the     "
            + "\nImmigration Museum. A Wall of Honor rests outside the "
            + "\nmain building, containing a partial list of immigrants"
            + "\nprocessed on the island.                              "),
    
    New_York_Public_Library("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| New York Public Library                            |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nThe New York Public Library is a public library       "
            + "\nsystem in New York City. With nearly 53 million items,"
            + "\nthe New York Public Library is the second largest     "
            + "\npublic library in the United States (behind the       "
            + "\nLibrary of Congress), and fourth largest in the world."
            + "\nA magnificent example of Beaux-Arts style of          "
            + "\narchitecture, this library has symbolized the         "
            + "\ndemocratic ideal of free and open access to knowledge "
            + "\nsince it opened to the public in 1911. Patience and   "
            + "\nFortitude, the world-renowned pair of marble lions    "
            + "\nthat stand proudly before the majestic Beaux-Arts     "
            + "\nbuilding, await you as you enter the building.        "),
    
    Fifth_Avenue("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Fifth Avenue                                       |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nFith Avenue is best known as an unrivaled shopping    "
            + "\nstreet. Almost any upscale retailer has a prestigious "
            + "\nstore located on this street. It is considered among  "
            + "\nthe most expensive and best shopping streets in the   "
            + "\nworld.This is one of the key streets that define New  "
            + "\nYork City. If you like window shopping, this is the   "
            + "\nplace you go. If you have money you will like it even "
            + "\nmore. The street is busy with bustling people flowing "
            + "\nin and out of the stores.                             "),
    
    Gothan_West_Market("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Gothan West Market                               |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nGothan West Market is a unique eating destination in"
            + "New York. It is the first-of-its-kind day & night     "
            + "market dining destination in Hell's Kitchen. The food "
            + " court style and inconvenient address proves that     "
            + "people going there are seeking for this new eating    "
            + "adventure. A sign in one of the business recently     "
            + "said: When was the last time you did something for    "
            + "the first time?                                       "),
    
    Washignton_Square_Park("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Washignton Square Park                             |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nWashington Square Park is a landmark in Manhattan.    "
            + "\nLocated in the neighborhood of Greenwich Village, it  "
            + "\nis as a meeting place and a center for cultural       "
            + "\nactivity. It is also known as a parade ground, a      "
            + "\ngathering spot for avant-garde artists, a battleground"
            + "\nfor chess enthusiasts, as well as a playground for    "
            + "\nchildren and canines. It is always full of life with  "
            + "\nstreet performers and people lounging.                "),
    
    Flatiron_Building("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Flatiron Building                                    |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nThe Flatiron Building is considered to be a             "
            + "\ngroundbreaking skyscraper. It is located at 175 Fift    "
            + "\nAvenue in the borough of Manhattan, New York City.      "
            + "\nMarvel has used many of its architecture as inspiration "
            + "\nfor location of its scenerios. It's a beautiful bulding."
            + "\nPeople go there to appreciate the architecture and      "
            + "\nlunch in the park accros the street. Currently, it is   "
            + "\nan office building containing offices for small and     "
            + "\nmedium sized companies.                                 "),
    
    Wall_Street("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Wall Street                                        |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nOver time, the term Wall Street has become a metonym  "
            + "\nfor the financial markets of the United States as a   "
            + "\nwhole. It's also the American financial sector ,even  "
            + "\nif financial firms are not physically located there,  "
            + "\nand signifies New York-based financial interests. It  "
            + "\nhas a conotation of power and money. The movie Wall   "
            + "\nStreet exemplifies the image this area came to        "
            + "\nsymbolize. From there you can walk to trinity church, "
            + "\nwhich is a very contrasting image and feel for the    "
            + "\nwhole area.                                           "),
    
    Queensbridge_Park_Queens("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Queensbridge Park Queens                           |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nQueensbridge Park is a beautiful park with mature     "
            + "\ntrees, ball fields, and plenty of families barbecuing "
            + "\non weekends. It also has a nice paved walkway along   "
            + "\nthe East River with great views of the Queensboro     "
            + "\nBridge, Roosevelt Island, midtown Manhattan and the   "
            + "\nFreedom Tower in the distance.This park is named for  "
            + "\nthe nearby Queensboro Bridge. From there, there are   "
            + "\nspectacular views of 59th Street bridge, Chrysler     "
            + "\nBuilding, Empire State Building, and more. It provides"
            + "\na very good place to admire NY from a close distance. "),
    
    Music_Hall_of_Williamsburg_Brooklyn("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Music Hall of Williamsburg Brooklyn                 |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nThe Music Hall of Williamsburg is a venue located at   "
            + "\n66 North 6th Street in the Williamsburg neighborhood of"
            + "\nBrooklyn. The venue has a capacity of 550 people and   "
            + "\nhas shows on most nights of the week.  Indie-rock fans "
            + "\ngroove to live music at this popular triple-tiered     "
            + "\nclub that offer three bars on location.                "),
            
    
    Carlos_Bakery_New_Jersey("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Carlos Bakery New Jersey                             |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nCarlo's is a family owned bakery featured on Cake       "
            + "\nBoss. It is known for its delicious pastries, desserts  "
            + "\nand cakes. Master Baker, Bartolo Jr. “Buddy”, has been   "
            + "\nfeatured in numerous publications,and his cake was voted"
            + "\nby the Today’s Show viewers as best cake in America.     "),
    
    Radio_City_Music_Hall("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Radio City Music Hall                              |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nRadio City Music Hall is an entertainment venue       "
            + "\nlocated in Rockefeller Center. Its nickname is the    "
            + "\nShowplace of the Nation, and for a time it was the    "
            + "\nleading tourist destination in the city. people go    "
            + "\nthere to watch world famous performances and to enjoy "
            + "\nthe beautifuly decorated location. It is famous for   "
            + "\nthe Spectacular with the Rockettes. It is quite an    "
            + "\nopulent treat to visit.                               "),
    
    The_Cathedral_Church_of_St_John_the_Divine("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| The Cathedral Church of St John the Divine        |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nThere is a dispute about whether the Cathedral church"
            + "\nof St. John, the Divine, or  the Liverpool Cathedral  "
            + "\nis the world's largest Anglican cathedral existing     "
            + "\ntoday. This immense and historic church is known for   "
            + "\nits concerts, Sunday service & annual blessing of      "
            + "\nanimals. The adjacent Peace Garden is one of the most  "
            + "\nwhimsical places in the city.                          "),
    
    United_Nation_Headquarters("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| United Nation Headquarters                         |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nThe United Nations Headquarters is located in the     "
            + "\nheart of New York City . This 18-acre site has been   "
            + "\ndeclared international territory and belongs to the   "
            + "\n193 Member States of the United Nations. It was       "
            + "\nfounded in 1945 after the Second World War by 51      "
            + "\ncountries committed to maintaining international      "
            + "\npeace and security, developing friendly relations     "
            + "\namong nations and promoting social progress, better   "
            + "\nliving standards and human rights.                    "),
    
    Unisphere_Queens("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Unisphere Queens                                     |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nThe Unisphere is a 12-story high, spherical stainless   "
            + "\nsteel representation of the Earth.The unofficial symbol "
            + "\nof Queens, it exists as one of the few remaining        "
            + "\nartifacts from the 1964-65 New York World's Fair. Three   "
            + "\nrings circle the globe, representing the orbits of the    "
            + "\nfirst American astronaut, the first Russian cosmonaut     "
            + "\nand the first communications satellite to orbit the Earth."),
    
    Yankee_Stadium_Bronx("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Yankee Stadium Bronx                             |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nYankee Stadium is a stadium located in the Bronx. It"
            + "is the home ballpark for the New York Yankees of Major"
            + "League Baseball and the home stadium for New York City"
            + "FC of Major League Soccer. People are impressed with  "
            + "this new structure even with the historical landmarks "
            + "around to compare. It is great place to visit if you  "
            + "enjoy baseball.                                       "),
    
    Nine_Eleven_Museum("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| 9-11 Museum                                        |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n The National September 11 Memorial & Museum is the    "
            + "\n principal memorial and museum, respectively             "
            + "\n commemorating the September 11 attacks of 2001 and the  "
            + "\n World Trade Center bombing of 1993. The Museum displays "
            + "\n artifacts associated with the events of 9/11, while its"
            + "\n mission is to honor the memories of those killed on    "
            + "\n 9/11 and educate future generations. It was created as  "
            + "\n a tribute the victims and the families.                "),
    
    High_Line("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| High Line                                          |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nThe High Line Park in Manhattan was built on an       "
            + "\nelevated section of a disused New York Central        "
            + "\nRailroad spur called the West Side Line. It stands 30 "
            + "\nfeet above street level on an old rail line,          "
            + "\nfantastically reclaiming the disused piece of         "
            + "\ninfrastructure. The beautiful design is now a park    "
            + "\nwhere you can take in the serenity and some pretty    "
            + "\namazing city views.                                   "),
    
    Manhatan_Temple("\n"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\n| Manhathan Temple                                   |"
            + "\n------------------------------------------------------------------------------------------------------------------------"
            + "\nYou arrived in front of the LDS Manhattan Temple.     "
            + "\nYou cannot believe that a temple can be located in the"
            + "\nmiddle of the hussle and bussle of a city like New    "
            + "\nYork. You can see it almost immediately as you come   "
            + "\nout of the subway. It is located at the intersection  "
            + "\nof West 65th Street, Broadway, and Columbus Avenue.   "
            + "\nThe temple stands among some of New York City's most  "
            + "\nprominent landmarks including the Lincoln Center, and "
            + "\nCentral Park a walking distance away. As you stand in "
            + "\nthe little plaza in front of the temple to contemplate"
            + "\nits beauty and significance, a pedestrian approaches  "
            + "\nyou and asks a question.                              ");
    
    private final String description;
        
    Scene(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
    
    
}
