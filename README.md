**Endemic** is a mod for Minecraft that allows you to configure how saplings grow! Do you wish that you could grow all of those endemic trees that you find in the world but once cut down are lost forever? Now you can regrow those swamp oaks, super birches, pine spruces, and more!

Create sets of trees that you can conditionally grow based on the surrounding dimension and biome, immediate elevation and luminance ranges, and even temperature and precipitation ranges. This means you can create deep configurations in conjunction with mods that change the weather and seasons, make certain tree variants grow at certain altitudes, or make it so you can only grow certain trees in those special places where you find them natively to keep the charm and promote trade and travel!

Endemic allows you to override any sapling that uses the vanilla tree grower, including modded saplings! Any sapling that does not have an entry in the config will just follow its vanilla growth behavior.

By default, Endemic focuses on bringing those endemic tree variants such as swamp oaks back to their biomes, preserves trees growing in their native habitats, and makes saplings grown outside of their native biomes end up growing as new shrub forms. In addition, the dimension for each sapling is filtered to the Overworld, so saplings won't grow up in The Nether and The End. Don't like that behavior? Just give the sapling set an empty dimension/biome list!

The power is yours to create intricate sapling growth behavior if you so choose. Delve into the possibilities!

#### Compiling

To build from source you will need have JDK 21 to compile and, optionally, Git to clone the repository. Otherwise, download the archive and just run `./gradlew build` from the root project folder.

When using Git, just choose a directory you wish to keep the project root folder in, decide which branch you wish to compile, and then run these commands:

```shell script
git clone --branch <branch> --recursive https://github.com/yurisuika/endemic.git

cd ./endemic

./gradlew runDatagen # Needed for 1.19.3 and up!
./gradlew build
```

Afterwards, your compiled JAR will be in `./build/libs`.

#### Releases

Don't want to bother building from source? Get the releases *[right here](https://github.com/yurisuika/Endemic/releases)* now!

#### Repositories

You can find Endemic on both *[CurseForge](https://www.curseforge.com/minecraft/mc-mods/endemic)* and *[Modrinth](https://modrinth.com/mod/endemic)*!

#### Community

The one and only! Join the *[Discord](https://discord.gg/0zdNEkQle7Qg9C1H)* to find the latest discussion on the resource pack and server or just to chat!