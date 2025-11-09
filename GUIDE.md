# Guia de Fluxo Git (Git Flow simplificado)

## Baseline
```bash
git init
git add .
git commit -m "chore: baseline 1.0.0"
git branch -M main
git remote add origin <URL-do-repo>
git push -u origin main
git tag v1.0.0 -m "Versão inicial (baseline)"
git push origin v1.0.0
```

## Branch de cada integrante
```bash
git checkout -b feature/login
# edite LoginService.java e App.java
git add .
git commit -m "feat(login): adiciona validação de senha mínima (6)"
git push origin feature/login
# Abra PR no GitHub
```

Outro integrante:
```bash
git checkout -b feature/interface
# edite App.java (textos/menu)
git add .
git commit -m "feat(ui): melhora mensagens e menu"
git push origin feature/interface
# Abra PR no GitHub
```

## Integração e versão
No GitHub, aprove os PRs, resolva conflitos se houver e faça **merge** em `main`.  
Atualize o `CHANGELOG.md` e crie a tag:

```bash
git checkout main
git pull
git tag v1.1.0 -m "Implementações de login e interface"
git push origin v1.1.0
```

Inclua prints de **commits, PRs, merges e tags** em `docs/screenshots/` para o relatório.
