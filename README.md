# 🕶️ Silent Admin Join

A lightweight Minecraft plugin that lets admins join the server without triggering public join messages.  
Perfect for stealth moderation, surprise appearances, or keeping your entrance mythically quiet.

---

## ✨ Features

- Suppresses join messages for players with `silentjoin.use`
- Optional particle and sound effects on silent entry
- Configurable via `config.yml`
- Lightweight and easy to install

---

## 💬 Example Behavior

- Admin joins silently:
- [No join message shown]
- Plays a subtle sound (e.g. `ENTITY_ENDERMAN_TELEPORT`)
- Spawns a particle effect (e.g. `TOTEM`) at their location

- Regular players join normally:
- James joined the game

---

## ⚙️ Configuration

Edit `config.yml` to customize effects:

```yaml
enableEffect: true
effectType: "TOTEM"
enableSound: tr

🛠️ Installation
- Build with Maven:
mvn clean package
- Drop the .jar from target/ into your server’s plugins/ folder
- Restart the server
- Give players the silentjoin.use permission to enable silent entry

🧪 Compatibility
- PaperMC 1.20.1+
- Java 17+
- Works with most permission plugins (LuckPerms, PermissionsEx, etc.)

📜 License
MIT — fork it, remix it, and vanish in style.
