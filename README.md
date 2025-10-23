**Endemic** is a Fabric mod for Minecraft that allows you to grow trees endemic to their biomes with vanilla saplings! Now you can regrow those swamp oaks, super birches, pine spruces, and more! However, that is not all; Endemic can also make saplings grow differently depending on their native biomes!

With 2.0, Endemic has been rewritten to use tags! Each species has four categories of biome tags: endemic, native, nonnative, and dead. The last one isn't actually a tag, but any biome that is not is the other three will fall under this category. As you can imagine, any endemic species only grow in special biomes. Native species grow in many biomes and may grow alongside their endemic species. If a species is grown outside of its native habitat, it will grow as a shrubby form. And finally, if a species is deemed to be far too outside of its natives habitat, it is left to grow as a dead bush!

As mentioned, each species has a few forms it can grow in. Oaks and Birches of course have their additional forms with beehives (not listed here). Here are what each species grows as in its biome groups (all grow as dead shrub otherwise):
- Oak: Swamp Oak (Endemic) / Oak + Fancy Oak (Native) / Shrub (Nonnative)
- Birch: Tall Birch (Endemic) / Birch (Native) / Shrub (Nonnative)
- Spruce: Spruce (Endemic) / Pine (Native) / Shrub (Nonnative)
- Jungle: Vined Jungle (Endemic) / Jungle (Native) / Shrub (Nonnative)
- Acacia: Acacia (Endemic + Native) / Shrub (Nonnative)
- Dark Oak: Shrub (Endemic + Native + Nonnative)
- Giant Spruce: Giant Spruce (Endemic) / Giant Pine (Native) / Giant Shrub (Nonnative)
- Giant Jungle: Giant Jungle (Endemic + Native) / Giant Shrub (Nonnative)
- Giant Dark Oak: Giant Dark Oak (Endemic + Native) / Giant Shrub (Nonnative)

By default, all Nether, End, and Void biomes, plus the desert biome, are left untagged, and thus all trees will grow as dead bushes there. While the default settings have been fine tuned for a realistic distribution of species, you can customize these tags with your own data pack!

Furthermore, Endemic 2.0 features a reworked sky light growth behavior. Now, each tree form has four sub-forms of differing size, and depending on the light level in which a tree is grown, a different form will grow. The sets are as follows:
- Light 15-12: Full
- Light 11-08: Large
- Light 07-04: Medium
- Light 03-00: Small

#### Compiling

To build from source you will need have JDK 17 to compile and, optionally, Git to clone the repository. Otherwise, download the archive and just run `./gradlew build` from the root project folder.

When using Git, just choose a directory you wish to keep the project root folder in, decide which branch you wish to compile, and then run these commands:

```shell script
git clone --branch <branch> --recursive https://github.com/yurisuika/endemic.git

cd ./endemic

./gradlew build
```

Afterwards, your compiled JAR will be in `./build/libs`.

#### Releases

Don't want to bother building from source? Get the releases *[right here](https://github.com/yurisuika/Endemic/releases)* now!

#### Repositories

You can find Endemic on both *[CurseForge](https://www.curseforge.com/minecraft/mc-mods/endemic)* and *[Modrinth](https://modrinth.com/mod/endemic)*!

#### Community

The one and only! Join the *[Discord](https://discord.gg/0zdNEkQle7Qg9C1H)* to find the latest discussion on the resource pack and server or just to chat!