# SameOldSpells StationAPI for Minecraft Beta 1.7.3

Some basic world control using spells!
* Mod works on Multiplayer with [GlassConfigAPI](https://modrinth.com/mod/glass-config-api) version 3.0+ used to sync configs!

## List of changes
Note that all changes can be individually disabled using GlassConfigAPI if undesired

### Same Old Spells

Adds a couple unique spells to the game that are activated on entity collision:
- Arrow Spell: Fires an arrow in each cardinal direction (North, East, South, and West)
  - Single use, crafted from 1x spell vessel and 4x arrows
  - Crafting recipe is shaped with spell vessel in the center and arrows placed vertically and horizontally beside it
- Dark Spell: Makes night begin
  - Single use, crafted from 1x spell vessel and 1x obsidian
- Dark Spell Cube: Makes it midnight
  - Infinite use, NOT craft-able
- Fire Spell: Sets an entity on fire
  - Single use, crafted from 1x spell vessel and 1x fire
  - Fire is now craft-able via placing UNUSED flint and steel in the crafting grid (recipe output is 3x fire)
  - Configuration available to craft it directly from 1-3x spell vessels and 1x unused flint and steel (output is 1-3x fire spells)
- Fire Spell Cube: Sets an entity on fire only while in the spell cube
  - Infinite use, NOT craft-able
- Grass Spell: Clears the weather
  - Single use, crafted from 1x spell vessel and 1x dandelion (Vanilla b1.7.3 Minecraft just calls this item "Flower")
- Grass Spell Cube: Clears the weather
  - Infinite use, NOT craft-able
- Holy Spell: Spawns lightning
  - Single use, crafted from 1x spell vessel and 1x bookshelf
- Holy Spell Cube: Spawns lightning
  - Infinite use, NOT craft-able
- Light Spell: Makes daytime begin
  - Single use, crafted from 1x spell vessel and 1x glowstone
- Light Spell Cube: Makes it midday
  - Infinite use, NOT craft-able
- Spell Vessel: Does nothing
  - Single use, crafted from 1x glowstone dust and 4x snow blocks
  - Crafting recipe is shaped with glowstone dust in the center and snow blocks placed vertically and horizontally beside it
- Rock Spell: Starts a thunderstorm
  - Single use, crafted from 1x spell vessel and 1x iron block
- Rock Spell Cube: Starts a thunderstorm
  - Infinite use, NOT craft-able
- Water Spell: Starts rain
  - Single use, crafted from 1x spell vessel and 1x lapis lazuli block
- Water Spell Cube: Starts rain
  - Infinite use, NOT craft-able

## Special thanks to Rocetti/kcilds for the tile art <3

Find their original post at OpenGameArt.org here:
[https://opengameart.org/content/universal-fantasy-roguelike-tileset-16x16](https://opengameart.org/content/universal-fantasy-roguelike-tileset-16x16)

## Installation using Prism Launcher

1. Download an instance of Babric for Prism Launcher: https://github.com/babric/prism-instance
2. Install Java 17 and set the instance to use it: https://adoptium.net/temurin/releases/
3. Add GlassConfigAPI 3.0.2+ to the mod folder for the instance: https://modrinth.com/mod/glass-config-api
4. Add Glass Networking to the mod folder for the instance: https://modrinth.com/mod/glass-networking
5. Add StationAPI to the mod folder for the instance: https://modrinth.com/mod/stationapi
6. (Optional) Add Mod Menu to the mod folder for the instance: https://modrinth.com/mod/modmenu-beta
7. Add this mod to the mod folder for the instance: https://github.com/telvarost/SameOldSpells-StationAPI/releases
8. Run and enjoy! 👍

## Feedback

Got any suggestions on what should be added next? Feel free to share it by [creating an issue](https://github.com/telvarost/SameOldSpells-StationAPI/issues/new). Know how to code and want to do it yourself? Then look below on how to get started.

## Contributing

Thanks for considering contributing! To get started fork this repository, make your changes, and create a PR. 

If you are new to StationAPI consider watching the following videos on Babric/StationAPI Minecraft modding: https://www.youtube.com/watch?v=9-sVGjnGJ5s&list=PLa2JWzyvH63wGcj5-i0P12VkJG7PDyo9T
