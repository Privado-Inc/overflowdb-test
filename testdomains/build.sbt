name := "testdomains"

publish / skip := true

githubOwner      := "Privado-Inc"
githubRepository := "overflowdb-test"
credentials +=
  Credentials(
    "GitHub Package Registry",
    "maven.pkg.github.com",
    "Privado-Inc",
    sys.env.getOrElse("GITHUB_TOKEN", "N/A")
  )