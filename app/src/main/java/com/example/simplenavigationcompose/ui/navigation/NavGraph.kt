package com.example.simplenavigationcompose.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.simplenavigationcompose.ui.screens.Cyberbullying2Screen
import com.example.simplenavigationcompose.ui.screens.Cyberbullying3Screen
import com.example.simplenavigationcompose.ui.screens.Cyberbullying4Screen
import com.example.simplenavigationcompose.ui.screens.Cyberbullying5Screen
import com.example.simplenavigationcompose.ui.screens.Disinformation2Screen
import com.example.simplenavigationcompose.ui.screens.Disinformation3Screen
import com.example.simplenavigationcompose.ui.screens.DisinformationScreen
import com.example.simplenavigationcompose.ui.screens.Exploitation2Screen
import com.example.simplenavigationcompose.ui.screens.Exploitation3Screen
import com.example.simplenavigationcompose.ui.screens.Exploitation4Screen
import com.example.simplenavigationcompose.ui.screens.ExploitationScreen
import com.example.simplenavigationcompose.ui.screens.Filter2Screen
import com.example.simplenavigationcompose.ui.screens.Filter3Screen
import com.example.simplenavigationcompose.ui.screens.Filter4Screen
import com.example.simplenavigationcompose.ui.screens.Filter5Screen
import com.example.simplenavigationcompose.ui.screens.FilterScreen
import com.example.simplenavigationcompose.ui.screens.Footprint2Screen
import com.example.simplenavigationcompose.ui.screens.Footprint3Screen
import com.example.simplenavigationcompose.ui.screens.FootprintScreen
import com.example.simplenavigationcompose.ui.screens.Friendships2Screen
import com.example.simplenavigationcompose.ui.screens.Friendships3Screen
import com.example.simplenavigationcompose.ui.screens.HomeScreen
import com.example.simplenavigationcompose.ui.screens.Messages2Screen
import com.example.simplenavigationcompose.ui.screens.MessagesScreen
import com.example.simplenavigationcompose.ui.screens.Peer2Screen
import com.example.simplenavigationcompose.ui.screens.Peer3Screen
import com.example.simplenavigationcompose.ui.screens.Peer4Screen
import com.example.simplenavigationcompose.ui.screens.PeerScreen
import com.example.simplenavigationcompose.ui.screens.ProfileScreen
import com.example.simplenavigationcompose.ui.screens.Recruitment2Screen
import com.example.simplenavigationcompose.ui.screens.Recruitment3Screen
import com.example.simplenavigationcompose.ui.screens.Recruitment4Screen
import com.example.simplenavigationcompose.ui.screens.RecruitmentScreen
import com.example.simplenavigationcompose.ui.screens.SearchScreen
import com.example.simplenavigationcompose.ui.screens.SeriousScreen
import com.example.simplenavigationcompose.ui.screens.Spending2Screen
import com.example.simplenavigationcompose.ui.screens.Spending3Screen
import com.example.simplenavigationcompose.ui.screens.Spending4Screen
import com.example.simplenavigationcompose.ui.screens.SpendingScreen
import com.example.simplenavigationcompose.ui.screens.SuggestionScreen
import com.example.simplenavigationcompose.ui.screens.Time2Screen
import com.example.simplenavigationcompose.ui.screens.Time3Screen
import com.example.simplenavigationcompose.ui.screens.Time4Screen
import com.example.simplenavigationcompose.ui.screens.TimeScreen
import com.example.simplenavigationcompose.ui.screens.VerifyScreen
import com.example.simplenavigationcompose.ui.screens.Violent2Screen
import com.example.simplenavigationcompose.ui.screens.Violent3Screen
import com.example.simplenavigationcompose.ui.screens.ViolentScreen
import com.plcoding.searchfieldcompose.FindScreen


@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = NavRoute.Verify.path
    ) {
        addHomeScreen(navController, this)
        addVerifyScreen(navController, this)
        addProfileScreen(navController, this)
        addFindScreen(navController, this)

        addSearchScreen(navController, this)

        addDisinformationScreen(navController, this)
        addFilterScreen(navController, this)
        addFootprintScreen(navController, this)
        addPeerScreen(navController, this)
        addSeriousScreen(navController, this)
        addSpendingScreen(navController, this)
        addTimeScreen(navController, this)

        addCyberbullying2Screen(navController, this)
        addDisinformation2Screen(navController, this)
        addExploitationScreen(navController, this)
        addFilter2Screen(navController, this)
        addFootprint2Screen(navController, this)
        addFriendships2Screen(navController, this)
        addMessagesScreen(navController, this)
        addPeer2Screen(navController, this)
        addRecruitmentScreen(navController, this)
        addSpending2Screen(navController, this)
        addViolentScreen(navController, this)
        addTime2Screen(navController, this)

        addSuggestionScreen(navController, this)


        addCyberbullying3Screen(navController, this)
        addCyberbullying4Screen(navController, this)
        addCyberbullying5Screen(navController, this)

        addDisinformation3Screen(navController, this)
        addFilter3Screen(navController, this)
        addFilter4Screen(navController, this)
        addFilter5Screen(navController, this)

        addFootprint3Screen(navController, this)
        addFriendships3Screen(navController, this)
        addPeer3Screen(navController, this)
        addPeer4Screen(navController, this)
        addSpending3Screen(navController, this)
        addSpending4Screen(navController, this)
        addTime3Screen(navController, this)
        addTime4Screen(navController, this)


        addExploitation2Screen(navController, this)
        addExploitation3Screen(navController, this)
        addExploitation4Screen(navController, this)
        addMessages2Screen(navController, this)
        addRecruitment2Screen(navController, this)
        addRecruitment3Screen(navController, this)
        addRecruitment4Screen(navController, this)
        addViolent2Screen(navController, this)
        addViolent3Screen(navController, this)
    }
}




private fun addHomeScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Home.path) {
        HomeScreen(
            navigateToProfile = { id, showDetails ->
                navController.navigate(NavRoute.Profile.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToSearch = { query ->
                navController.navigate(NavRoute.Search.withArgs(query))
            },
            popBackStack = { navController.popBackStack() },
            popUpToHome = { popUpToHome(navController) },

            navigateToDisinformation = { id, showDetails ->
                navController.navigate(NavRoute.Disinformation.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToFilter = { id, showDetails ->
                navController.navigate(NavRoute.Filter.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToFootprint = { id, showDetails ->
                navController.navigate(NavRoute.Footprint.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToPeer = { id, showDetails ->
                navController.navigate(NavRoute.Peer.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToSerious = { id, showDetails ->
                navController.navigate(NavRoute.Serious.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToSpending = { id, showDetails ->
                navController.navigate(NavRoute.Spending.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToTime = { id, showDetails ->
                navController.navigate(NavRoute.Time.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToFind = {navController.navigate(NavRoute.Find.withArgs())
            },
            navigateToSuggestion = {navController.navigate(NavRoute.Suggestion.withArgs())
            },
        )
    }
}
private fun popUpToHome(navController: NavHostController) {
    navController.popBackStack(NavRoute.Home.path, inclusive = false) }



private fun addVerifyScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Verify.withArgsFormat(),
        arguments = listOf()
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        VerifyScreen(
            navigateToHome= { ->
                navController.navigate(NavRoute.Home.withArgs())
            },
        )
    }
}


private fun addSuggestionScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Suggestion.withArgsFormat(),
        arguments = listOf()
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        SuggestionScreen(
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}


private fun addFindScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Find.withArgsFormat(),
        arguments = listOf()
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        FindScreen(
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}


private fun addProfileScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Profile.withArgsFormat(NavRoute.Profile.id, NavRoute.Profile.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Profile.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Profile.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        ProfileScreen(
            id = args?.getInt(NavRoute.Profile.id)!!,
            showDetails = args.getBoolean(NavRoute.Profile.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToCyberbullying2 = { id, showDetails ->
                navController.navigate(NavRoute.Cyberbullying2.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToCyberbullying3 = { id, showDetails ->
                navController.navigate(NavRoute.Cyberbullying3.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToCyberbullying4 = { id, showDetails ->
                navController.navigate(NavRoute.Cyberbullying4.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToCyberbullying5 = { id, showDetails ->
                navController.navigate(NavRoute.Cyberbullying5.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}



private fun addSearchScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Search.withArgsFormat(NavRoute.Search.query),
        arguments = listOf(
            navArgument(NavRoute.Search.query) {
                type = NavType.StringType
                nullable = true
            }
        )
    ) { navBackStackEntry ->

        val args = navBackStackEntry.arguments
        SearchScreen(
            query = args?.getString(NavRoute.Search.query),
            popBackStack = { navController.popBackStack() },
            popUpToHome = { popUpToHome(navController) },
            navigateToFriendships2 = { id, showDetails ->
                navController.navigate(NavRoute.Friendships2.withArgs(id.toString(), showDetails.toString()))},
            navigateToFriendships3 = { id, showDetails ->
                navController.navigate(NavRoute.Friendships3.withArgs(id.toString(), showDetails.toString()))}
        )
    }
}



private fun addDisinformationScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Disinformation.withArgsFormat(NavRoute.Disinformation.id, NavRoute.Disinformation.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Disinformation.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Disinformation.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        DisinformationScreen(
            id = args?.getInt(NavRoute.Disinformation.id)!!,
            showDetails = args.getBoolean(NavRoute.Disinformation.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToDisinformation2 = { id, showDetails ->
                navController.navigate(NavRoute.Disinformation2.withArgs(id.toString(), showDetails.toString()))},
            navigateToDisinformation3 = { id, showDetails ->
                navController.navigate(NavRoute.Disinformation3.withArgs(id.toString(), showDetails.toString()))}
        )
    }
}


private fun addFilterScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Filter.withArgsFormat(NavRoute.Filter.id, NavRoute.Filter.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Filter.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Filter.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        FilterScreen(
            id = args?.getInt(NavRoute.Filter.id)!!,
            showDetails = args.getBoolean(NavRoute.Filter.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToFilter2 = { id, showDetails ->
                navController.navigate(NavRoute.Filter2.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToFilter3 = { id, showDetails ->
                navController.navigate(NavRoute.Filter3.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToFilter4 = { id, showDetails ->
                navController.navigate(NavRoute.Filter4.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToFilter5 = { id, showDetails ->
                navController.navigate(NavRoute.Filter5.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}


private fun addFootprintScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Footprint.withArgsFormat(NavRoute.Footprint.id, NavRoute.Footprint.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Footprint.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Footprint.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        FootprintScreen(
            id = args?.getInt(NavRoute.Footprint.id)!!,
            showDetails = args.getBoolean(NavRoute.Footprint.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToFootprint2 = { id, showDetails ->
                navController.navigate(NavRoute.Footprint2.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToFootprint3 = { id, showDetails ->
                navController.navigate(NavRoute.Footprint3.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}


private fun addSeriousScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Serious.withArgsFormat(NavRoute.Serious.id, NavRoute.Serious.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Serious.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Serious.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        SeriousScreen(
            id = args?.getInt(NavRoute.Serious.id)!!,
            showDetails = args.getBoolean(NavRoute.Serious.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToExploitation = { id, showDetails ->
                navController.navigate(NavRoute.Exploitation.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToRecruitment = { id, showDetails ->
                navController.navigate(NavRoute.Recruitment.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToMessages = { id, showDetails ->
                navController.navigate(NavRoute.Messages.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToViolent = { id, showDetails ->
                navController.navigate(NavRoute.Violent.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}



private fun addPeerScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Peer.withArgsFormat(NavRoute.Peer.id, NavRoute.Peer.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Peer.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Peer.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        PeerScreen(
            id = args?.getInt(NavRoute.Peer.id)!!,
            showDetails = args.getBoolean(NavRoute.Peer.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToPeer2 = { id, showDetails ->
                navController.navigate(NavRoute.Peer2.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToPeer3 = { id, showDetails ->
                navController.navigate(NavRoute.Peer3.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToPeer4 = { id, showDetails ->
                navController.navigate(NavRoute.Peer4.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}




private fun addSpendingScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Spending.withArgsFormat(NavRoute.Spending.id, NavRoute.Spending.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Spending.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Spending.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        SpendingScreen(
            id = args?.getInt(NavRoute.Spending.id)!!,
            showDetails = args.getBoolean(NavRoute.Spending.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToSpending2 = { id, showDetails ->
                navController.navigate(NavRoute.Spending2.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToSpending3 = { id, showDetails ->
                navController.navigate(NavRoute.Spending3.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToSpending4 = { id, showDetails ->
                navController.navigate(NavRoute.Spending4.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}







private fun addCyberbullying2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Cyberbullying2.withArgsFormat(NavRoute.Cyberbullying2.id, NavRoute.Cyberbullying2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Cyberbullying2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Cyberbullying2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Cyberbullying2Screen(
            id = args?.getInt(NavRoute.Cyberbullying2.id)!!,
            showDetails = args.getBoolean(NavRoute.Cyberbullying2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}


private fun addDisinformation2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Disinformation2.withArgsFormat(NavRoute.Disinformation2.id, NavRoute.Disinformation2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Disinformation2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Disinformation2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Disinformation2Screen(
            id = args?.getInt(NavRoute.Disinformation2.id)!!,
            showDetails = args.getBoolean(NavRoute.Disinformation2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addExploitationScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Exploitation.withArgsFormat(NavRoute.Exploitation.id, NavRoute.Exploitation.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Exploitation.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Exploitation.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        ExploitationScreen(
            id = args?.getInt(NavRoute.Exploitation.id)!!,
            showDetails = args.getBoolean(NavRoute.Exploitation.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= {popUpToHome(navController) },
            navigateToExploitation2 = { id, showDetails ->
                navController.navigate(NavRoute.Exploitation2.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToExploitation3 = { id, showDetails ->
                navController.navigate(NavRoute.Exploitation3.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToExploitation4 = { id, showDetails ->
                navController.navigate(NavRoute.Exploitation4.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}



private fun addFilter2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Filter2.withArgsFormat(NavRoute.Filter2.id, NavRoute.Filter2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Filter2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Filter2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Filter2Screen(
            id = args?.getInt(NavRoute.Filter2.id)!!,
            showDetails = args.getBoolean(NavRoute.Filter2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addFootprint2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Footprint2.withArgsFormat(NavRoute.Footprint2.id, NavRoute.Footprint2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Footprint2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Footprint2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Footprint2Screen(
            id = args?.getInt(NavRoute.Footprint2.id)!!,
            showDetails = args.getBoolean(NavRoute.Footprint2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },

        )
    }
}



private fun addFriendships2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Friendships2.withArgsFormat(NavRoute.Friendships2.id, NavRoute.Friendships2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Friendships2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Friendships2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Friendships2Screen(
            id = args?.getInt(NavRoute.Friendships2.id)!!,
            showDetails = args.getBoolean(NavRoute.Friendships2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },

        )
    }
}



private fun addMessagesScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Messages.withArgsFormat(NavRoute.Messages.id, NavRoute.Messages.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Messages.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Messages.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        MessagesScreen(
            id = args?.getInt(NavRoute.Messages.id)!!,
            showDetails = args.getBoolean(NavRoute.Messages.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToMessages2 = { id, showDetails ->
                navController.navigate(NavRoute.Messages2.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}



private fun addPeer2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Peer2.withArgsFormat(NavRoute.Peer2.id, NavRoute.Peer2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Peer2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Peer2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Peer2Screen(
            id = args?.getInt(NavRoute.Peer2.id)!!,
            showDetails = args.getBoolean(NavRoute.Peer2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addRecruitmentScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Recruitment.withArgsFormat(NavRoute.Recruitment.id, NavRoute.Recruitment.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Recruitment.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Recruitment.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        RecruitmentScreen(
            id = args?.getInt(NavRoute.Recruitment.id)!!,
            showDetails = args.getBoolean(NavRoute.Recruitment.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToRecruitment2 = { id, showDetails ->
                navController.navigate(NavRoute.Recruitment2.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToRecruitment3 = { id, showDetails ->
                navController.navigate(NavRoute.Recruitment3.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToRecruitment4 = { id, showDetails ->
                navController.navigate(NavRoute.Recruitment4.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}



private fun addSpending2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Spending2.withArgsFormat(NavRoute.Spending2.id, NavRoute.Spending2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Spending2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Spending2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Spending2Screen(
            id = args?.getInt(NavRoute.Spending2.id)!!,
            showDetails = args.getBoolean(NavRoute.Spending2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addViolentScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Violent.withArgsFormat(NavRoute.Violent.id, NavRoute.Violent.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Violent.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Violent.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        ViolentScreen(
            id = args?.getInt(NavRoute.Violent.id)!!,
            showDetails = args.getBoolean(NavRoute.Violent.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToViolent2 = { id, showDetails ->
                navController.navigate(NavRoute.Violent2.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToViolent3 = { id, showDetails ->
                navController.navigate(NavRoute.Violent3.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}

















private fun addCyberbullying3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Cyberbullying3.withArgsFormat(NavRoute.Cyberbullying3.id, NavRoute.Cyberbullying3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Cyberbullying3.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Cyberbullying3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Cyberbullying3Screen(
            id = args?.getInt(NavRoute.Cyberbullying3.id)!!,
            showDetails = args.getBoolean(NavRoute.Cyberbullying3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addCyberbullying4Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Cyberbullying4.withArgsFormat(NavRoute.Cyberbullying4.id, NavRoute.Cyberbullying4.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Cyberbullying4.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Cyberbullying4.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Cyberbullying4Screen(
            id = args?.getInt(NavRoute.Cyberbullying4.id)!!,
            showDetails = args.getBoolean(NavRoute.Cyberbullying4.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addCyberbullying5Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Cyberbullying5.withArgsFormat(NavRoute.Cyberbullying5.id, NavRoute.Cyberbullying5.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Cyberbullying5.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Cyberbullying5.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Cyberbullying5Screen(
            id = args?.getInt(NavRoute.Cyberbullying5.id)!!,
            showDetails = args.getBoolean(NavRoute.Cyberbullying5.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}

private fun addDisinformation3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Disinformation3.withArgsFormat(NavRoute.Disinformation3.id, NavRoute.Disinformation3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Disinformation3.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Disinformation3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Disinformation3Screen(
            id = args?.getInt(NavRoute.Disinformation3.id)!!,
            showDetails = args.getBoolean(NavRoute.Disinformation3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}


private fun addFilter3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Filter3.withArgsFormat(NavRoute.Filter3.id, NavRoute.Filter3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Filter3.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Filter3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Filter3Screen(
            id = args?.getInt(NavRoute.Filter3.id)!!,
            showDetails = args.getBoolean(NavRoute.Filter3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addFilter4Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Filter4.withArgsFormat(NavRoute.Filter4.id, NavRoute.Filter4.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Filter4.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Filter4.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Filter4Screen(
            id = args?.getInt(NavRoute.Filter4.id)!!,
            showDetails = args.getBoolean(NavRoute.Filter4.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addFilter5Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Filter5.withArgsFormat(NavRoute.Filter5.id, NavRoute.Filter5.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Filter5.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Filter5.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Filter5Screen(
            id = args?.getInt(NavRoute.Filter5.id)!!,
            showDetails = args.getBoolean(NavRoute.Filter5.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addFootprint3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Footprint3.withArgsFormat(NavRoute.Footprint3.id, NavRoute.Footprint3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Footprint3.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Footprint3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Footprint3Screen(
            id = args?.getInt(NavRoute.Footprint3.id)!!,
            showDetails = args.getBoolean(NavRoute.Footprint3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addFriendships3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Friendships3.withArgsFormat(NavRoute.Friendships3.id, NavRoute.Friendships3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Friendships3.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Friendships3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Friendships3Screen(
            id = args?.getInt(NavRoute.Friendships3.id)!!,
            showDetails = args.getBoolean(NavRoute.Friendships3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addPeer3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Peer3.withArgsFormat(NavRoute.Peer3.id, NavRoute.Peer3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Peer3.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Peer3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Peer3Screen(
            id = args?.getInt(NavRoute.Peer3.id)!!,
            showDetails = args.getBoolean(NavRoute.Peer3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addPeer4Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Peer4.withArgsFormat(NavRoute.Peer4.id, NavRoute.Peer4.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Peer4.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Peer4.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Peer4Screen(
            id = args?.getInt(NavRoute.Peer4.id)!!,
            showDetails = args.getBoolean(NavRoute.Peer4.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addSpending3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Spending3.withArgsFormat(NavRoute.Spending3.id, NavRoute.Spending3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Spending3.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Spending3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Spending3Screen(
            id = args?.getInt(NavRoute.Spending3.id)!!,
            showDetails = args.getBoolean(NavRoute.Spending3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addSpending4Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Spending4.withArgsFormat(NavRoute.Spending4.id, NavRoute.Spending4.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Spending4.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Spending4.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Spending4Screen(
            id = args?.getInt(NavRoute.Spending4.id)!!,
            showDetails = args.getBoolean(NavRoute.Spending4.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}








private fun addExploitation2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Exploitation2.withArgsFormat(NavRoute.Spending4.id, NavRoute.Exploitation2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Exploitation2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Exploitation2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Exploitation2Screen(
            id = args?.getInt(NavRoute.Exploitation2.id)!!,
            showDetails = args.getBoolean(NavRoute.Exploitation2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}

private fun addExploitation3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Exploitation3.withArgsFormat(NavRoute.Exploitation3.id, NavRoute.Exploitation3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Exploitation3.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Exploitation3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Exploitation3Screen(
            id = args?.getInt(NavRoute.Exploitation3.id)!!,
            showDetails = args.getBoolean(NavRoute.Exploitation3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}

private fun addExploitation4Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Exploitation4.withArgsFormat(NavRoute.Spending4.id, NavRoute.Exploitation4.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Exploitation4.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Exploitation4.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Exploitation4Screen(
            id = args?.getInt(NavRoute.Exploitation4.id)!!,
            showDetails = args.getBoolean(NavRoute.Exploitation4.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}

private fun addMessages2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Messages2.withArgsFormat(NavRoute.Messages2.id, NavRoute.Messages2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Messages2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Messages2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Messages2Screen(
            id = args?.getInt(NavRoute.Messages2.id)!!,
            showDetails = args.getBoolean(NavRoute.Messages2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}

private fun addRecruitment2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Spending4.withArgsFormat(NavRoute.Recruitment2.id, NavRoute.Recruitment2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Recruitment2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Recruitment2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Recruitment2Screen(
            id = args?.getInt(NavRoute.Recruitment2.id)!!,
            showDetails = args.getBoolean(NavRoute.Recruitment2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}

private fun addRecruitment3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Recruitment3.withArgsFormat(NavRoute.Recruitment3.id, NavRoute.Recruitment3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Recruitment3.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Recruitment3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Recruitment3Screen(
            id = args?.getInt(NavRoute.Recruitment3.id)!!,
            showDetails = args.getBoolean(NavRoute.Recruitment3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}

private fun addRecruitment4Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Recruitment4.withArgsFormat(NavRoute.Recruitment4.id, NavRoute.Recruitment4.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Recruitment4.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Recruitment4.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Recruitment4Screen(
            id = args?.getInt(NavRoute.Recruitment4.id)!!,
            showDetails = args.getBoolean(NavRoute.Recruitment4.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}

private fun addViolent2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Violent2.withArgsFormat(NavRoute.Violent2.id, NavRoute.Violent2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Violent2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Violent2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Violent2Screen(
            id = args?.getInt(NavRoute.Violent2.id)!!,
            showDetails = args.getBoolean(NavRoute.Violent2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}

private fun addViolent3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Violent3.withArgsFormat(NavRoute.Violent3.id, NavRoute.Violent3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Violent3.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Violent3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Violent3Screen(
            id = args?.getInt(NavRoute.Violent3.id)!!,
            showDetails = args.getBoolean(NavRoute.Violent3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
        )
    }
}



private fun addTimeScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Time.withArgsFormat(NavRoute.Time.id, NavRoute.Time.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Time.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Time.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        TimeScreen(
            id = args?.getInt(NavRoute.Time.id)!!,
            showDetails = args.getBoolean(NavRoute.Time.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },
            navigateToTime2 = { id, showDetails ->
                navController.navigate(NavRoute.Time2.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToTime3 = { id, showDetails ->
                navController.navigate(NavRoute.Time3.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToTime4 = { id, showDetails ->
                navController.navigate(NavRoute.Time4.withArgs(id.toString(), showDetails.toString()))
            },
        )
    }
}

private fun addTime2Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Time2.withArgsFormat(NavRoute.Time2.id, NavRoute.Time2.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Time2.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Time2.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Time2Screen(
            id = args?.getInt(NavRoute.Time2.id)!!,
            showDetails = args.getBoolean(NavRoute.Time2.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome= { popUpToHome(navController) },

        )
    }
}

private fun addTime3Screen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Time3.withArgsFormat(NavRoute.Time3.id, NavRoute.Time3.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Time3.id) {
                type = NavType.IntType
            },
            navArgument(NavRoute.Time3.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->
        val args = navBackStackEntry.arguments
        Time3Screen(
            id = args?.getInt(NavRoute.Time3.id)!!,
            showDetails = args.getBoolean(NavRoute.Time3.showDetails),
            popBackStack = { navController.popBackStack() },
            popUpToHome = { popUpToHome(navController) },

            )
    }
}


    private fun addTime4Screen(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.composable(
            route = NavRoute.Time4.withArgsFormat(NavRoute.Time4.id, NavRoute.Time4.showDetails),
            arguments = listOf(
                navArgument(NavRoute.Time4.id) {
                    type = NavType.IntType
                }
                ,
                navArgument(NavRoute.Time4.showDetails) {
                    type = NavType.BoolType
                }
            )
        ) { navBackStackEntry ->
            val args = navBackStackEntry.arguments
            Time4Screen(
                id = args?.getInt(NavRoute.Time4.id)!!,
                showDetails = args.getBoolean(NavRoute.Time4.showDetails),
                popBackStack = { navController.popBackStack() },
                popUpToHome= { popUpToHome(navController) },

                )
        }
    }
