import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import Home from '../pages/Home'

const Stack = createNativeStackNavigator()

export type HomeNavigatorProps = {}

function HomeNavigator({}: HomeNavigatorProps) {
	return (
		<Stack.Navigator>
			<Stack.Screen name="Main" component={Home} />
		</Stack.Navigator>
	)
}

export default HomeNavigator
