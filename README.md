# Projeto Exemplo – GCS (Git/GitHub)

Este repositório demonstra **Gerenciamento de Configuração de Software (GCS)** para a atividade do Moodle:
- Baseline 1.0.0 com `README.md`, `.gitignore` e `CHANGELOG.md`
- Branches de feature (`feature/login`, `feature/interface`), commits descritivos e Pull Requests
- Tagging semântico (v1.0.0, v1.1.0)
- Registro no `CHANGELOG.md`

## Tecnologias
- **Linguagem:** Java (11+)
- **IDE:** VS Code (sugerido) ou IntelliJ
- **Build:** `javac`/`java` padrão (sem Gradle/Maven para simplificar)

## Como compilar e executar
```bash
# dentro do diretório do projeto
javac -d out $(find src -name "*.java")
java -cp out br.ifsp.egsw.App
```

## Estrutura
```
src/br/ifsp/egsw/App.java           # main com mini fluxo
src/br/ifsp/egsw/LoginService.java  # validação simples
src/br/ifsp/egsw/User.java          # modelo de usuário
CHANGELOG.md
README.md
.gitignore
docs/screenshots/                   # coloque aqui prints de commits/PRs/tags
```

## Roteiro para cumprir a atividade
1. **Crie o repo público** no GitHub com o nome `ads-egsw-seunome-nomedodupla` e envie estes arquivos.
2. **Crie baseline 1.0.0** e a tag:
   ```bash
   git tag v1.0.0 -m "Versão inicial (baseline)"
   git push origin v1.0.0
   ```
3. **Cada integrante cria sua branch** e implementa algo:
   - `feature/login` → melhore a validação no `LoginService`
   - `feature/interface` → ajuste textos/menu em `App`
4. **Commits claros** e **Pull Requests** para `main`. Resolva conflitos se houver.
5. **Atualize o CHANGELOG.md** e crie a **tag v1.1.0** após o merge.
6. Gere e envie o **Relatório em PDF** (use o modelo já gerado ou `docs/Relatorio_GCS_Tecnico.pdf`).

## Exemplos de commits
- `feat(login): adiciona validação mínima de senha`
- `feat(ui): melhora mensagens do menu e fluxo`
- `docs(changelog): registra mudanças da versão 1.1.0`

Boa atividade!