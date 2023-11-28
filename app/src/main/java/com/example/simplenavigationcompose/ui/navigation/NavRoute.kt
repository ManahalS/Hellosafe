package com.example.simplenavigationcompose.ui.navigation

sealed class NavRoute(val path: String) {

    object Verify: NavRoute("verify")

    object Find: NavRoute("find")

    object Suggestion: NavRoute("suggestion")



    object Home: NavRoute("home")

    object Profile: NavRoute("profile") {
        val id = "id"
        val showDetails = "showDetails"
    }

    object Search: NavRoute("search") {
        val query = "query"
    }

    object Disinformation: NavRoute("disinformation"){
        val id = "id"
        val showDetails = "showDetails"
    }
    object Filter: NavRoute("filter"){
        val id = "id"
        val showDetails = "showDetails"}

    object Footprint: NavRoute("footprint"){
        val id = "id"
        val showDetails = "showDetails"}

    object Peer: NavRoute("peer"){
        val id = "id"
        val showDetails = "showDetails"}

    object Serious: NavRoute("serious"){
        val id = "id"
        val showDetails = "showDetails"}

    object Spending: NavRoute("spending"){
        val id = "id"
        val showDetails = "showDetails"}

    object Time: NavRoute("time"){
        val id = "id"
        val showDetails = "showDetails"}




    object Cyberbullying2: NavRoute("cyberbullying2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Disinformation2: NavRoute("disinformation2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Exploitation: NavRoute("exploitation"){
        val id = "id"
        val showDetails = "showDetails"}

    object Filter2: NavRoute("filter2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Footprint2: NavRoute("footprint2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Friendships2: NavRoute("friendships2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Messages: NavRoute("messages"){
        val id = "id"
        val showDetails = "showDetails"}

    object Peer2: NavRoute("peer2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Recruitment: NavRoute("recruitment"){
        val id = "id"
        val showDetails = "showDetails"}

    object Spending2: NavRoute("spending2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Violent: NavRoute("violent"){
        val id = "id"
        val showDetails = "showDetails"}

    object Time2: NavRoute("time2"){
        val id = "id"
        val showDetails = "showDetails"}




    object Cyberbullying3: NavRoute("cyberbullying3"){
        val id = "id"
        val showDetails = "showDetails"}

    object Cyberbullying4: NavRoute("cyberbullying4"){
        val id = "id"
        val showDetails = "showDetails"}

    object Cyberbullying5: NavRoute("cyberbullying5"){
        val id = "id"
        val showDetails = "showDetails"}

    object Disinformation3: NavRoute("disinformation3"){
        val id = "id"
        val showDetails = "showDetails"}

    object Filter3: NavRoute("filter3"){
        val id = "id"
        val showDetails = "showDetails"}

    object Filter4: NavRoute("filter4"){
        val id = "id"
        val showDetails = "showDetails"}

    object Filter5: NavRoute("filter5"){
        val id = "id"
        val showDetails = "showDetails"}

    object Footprint3: NavRoute("footprint3"){
        val id = "id"
        val showDetails = "showDetails"}

    object Friendships3: NavRoute("friendships3"){
        val id = "id"
        val showDetails = "showDetails"}

    object Peer3: NavRoute("peer3"){
        val id = "id"
        val showDetails = "showDetails"}

    object Peer4: NavRoute("peer4"){
        val id = "id"
        val showDetails = "showDetails"}

    object Spending3: NavRoute("spending3"){
        val id = "id"
        val showDetails = "showDetails"}

    object Spending4: NavRoute("spending4"){
        val id = "id"
        val showDetails = "showDetails"}

    object Time3: NavRoute("time3"){
        val id = "id"
        val showDetails = "showDetails"}



    object Exploitation2: NavRoute("exploitation2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Exploitation3: NavRoute("exploitation3"){
        val id = "id"
        val showDetails = "showDetails"}

    object Exploitation4: NavRoute("exploitation4"){
        val id = "id"
        val showDetails = "showDetails"}

    object Messages2: NavRoute("messages2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Recruitment2: NavRoute("recruitment2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Recruitment3: NavRoute("recruitment3"){
        val id = "id"
        val showDetails = "showDetails"}

    object Recruitment4: NavRoute("recruitment4"){
        val id = "id"
        val showDetails = "showDetails"}

    object Violent2: NavRoute("violent2"){
        val id = "id"
        val showDetails = "showDetails"}

    object Violent3: NavRoute("violent3"){
        val id = "id"
        val showDetails = "showDetails"}

    object Time4: NavRoute("time4"){
        val id = "id"
        val showDetails = "showDetails"}





    // build navigation path (for screen navigation)
    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/$arg")
            }
        }
    }

    // build and setup route format (in navigation graph)
    fun withArgsFormat(vararg args: String) : String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/{$arg}")
            }
        }
    }
}


