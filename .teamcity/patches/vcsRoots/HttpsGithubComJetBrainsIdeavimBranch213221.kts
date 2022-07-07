package patches.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a vcsRoot with id = 'HttpsGithubComJetBrainsIdeavimBranch213221'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, GitVcsRoot({
    id("HttpsGithubComJetBrainsIdeavimBranch213221")
    name = "https://github.com/JetBrains/ideavim (branch 213-221)"
    url = "https://github.com/JetBrains/ideavim.git"
    branch = "213-221"
}))
