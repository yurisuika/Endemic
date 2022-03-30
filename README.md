<p align="center"><img src="https://github.com/yurisuika/Endemic/blob/Fabric-1.18/src/main/resources/assets/endemic/icon.png?raw=true" width="256" height="256"></p>

**Endemic** is a Fabric mod for Minecraft that allows you to grow trees endemic to their biomes with vanilla saplings! Now you can regrow those swamp oaks, super birches, pine spruces, and more! However, that is not all; Endemic can also make saplings grow differently depending on their native biomes!

There is a degree of configurability to Endemic. Press `g` by default to open the settings. You can enable or disable the mod's functionality entirely from here as well. Set the endemic chance high to allow saplings to grow into those endemic trees like swamp oaks and tall birches!

You can customize how saplings grow in The Overworld, with additional functionality for The Nether and The End! You can set each category to use either normal, stunted, or dead trees if a sapling is grown outside its native habitat. First it will try to grow a normal tree, then a stunted tree, and finally a dead tree. If it doesn't do any of these then nothing will happen, so you can set it so nonnative saplings never grow up.

Endemic works mainly based on biome categories. Thus, sapling growth is not strictly limited to where you would find a tree already existing, but rather allows some spread into nonnative territory without affecting growth. While there are more specifics than just this, here is the general idea:
- Oaks grow in temperate forests, extreme hills, and plains.
- Spruces grow in taiga forests, extreme hills, and mountains, and snowy/frozen biomes.
- Birches grow in temperate forests and extreme hills.
- Jungles grow in tropical jungles.
- Acacias grow in arid savannas.
- Dark Oaks grow in only the dark forest biome.

As well, ocean and river biomes allow you to grow trees a bit more easily outside their native habitat.

You can also configure the sky light requirements for trees to grow (and set chances for growth type)! If the sky light level is below your set level, saplings will grow differently to your likings (depending on the preexisting biome growth settings)! Set the light level to 0 and trees will grow as without the modifier. Set it to 1 and trees will grow differently in caves! Or even set the light to 13-14 and have trees grow as shrubs when under other trees!

#### Compiling

To build from source you will need have JDK 17 to compile and, optionally, Git to clone the repository. Otherwise, download the archive and just run `./gradlew build` from the root project folder.

When using Git, just choose a directory you wish to keep the project root folder in, decide which branch you wish to compile, and then run these commands:

```shell script
git clone --branch Fabric-1.18 --recursive https://github.com/yurisuika/endemic.git

cd ./endemic

./gradlew build
```

Afterwards, your compiled JAR will be in `./build/libs`.

#### Releases

Don't want to bother building from source? Get the releases *[right here](https://github.com/yurisuika/Endemic/releases)* now!

#### Repositories

You can find Compost on both *[CurseForge](https://www.curseforge.com/minecraft/mc-mods/endemic)* and *[Modrinth](https://modrinth.com/mod/endemic)*!

#### Credits

Endemic's *[config](https://github.com/TeamMidnightDust/MidnightLib)* is thanks to Minenash and MidnightDust!

#### Community

The one and only! Join the *[SuikaCraft Discord](https://discord.gg/0zdNEkQle7Qg9C1H)* to find the latest discussion on the resource pack and server or just to chat!
