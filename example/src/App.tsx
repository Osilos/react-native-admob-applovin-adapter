import { Text, View, StyleSheet, Pressable } from 'react-native';
import AdmobAppLovinAdapter from 'react-native-admob-applovin-adapter';

export default function App() {
  const setConsentIronSource = () => {
    AdmobAppLovinAdapter.setConsent(true);
  };
  return (
    <View style={styles.container}>
      <Pressable onPress={setConsentIronSource}>
        <Text>Press to send consent.</Text>
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
