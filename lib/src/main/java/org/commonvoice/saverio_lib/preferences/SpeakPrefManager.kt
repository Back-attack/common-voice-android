package org.commonvoice.saverio_lib.preferences

import android.content.Context

class SpeakPrefManager(ctx: Context) {

    private val preferences = ctx.getSharedPreferences("speakPreferences", Context.MODE_PRIVATE)

    var requiredSentencesCount: Int
        get() = preferences.getInt(Keys.REQUIRED_SENTENCES_COUNT.name, 50)
        set(value) {
            preferences.edit().putInt(Keys.REQUIRED_SENTENCES_COUNT.name, value).apply()
        }

    var periodicallyRefreshSentences: Boolean
        get() = preferences.getBoolean(Keys.PERIODICALLY_REFRESH_SENTENCES.name, false)
        set(value) {
            preferences.edit().putBoolean(Keys.PERIODICALLY_REFRESH_SENTENCES.name, value).apply()
        }

    var playRecordingSoundIndicator: Boolean
        get() = preferences.getBoolean(Keys.ENABLE_RECORDING_SOUND_INDICATOR.name, false)
        set(value) {
            preferences.edit().putBoolean(Keys.ENABLE_RECORDING_SOUND_INDICATOR.name, value).apply()
        }

    var skipRecordingConfirmation: Boolean
        get() = preferences.getBoolean(Keys.SKIP_RECORDING_CONFIRMATION.name, false)
        set(value) {
            preferences.edit().putBoolean(Keys.SKIP_RECORDING_CONFIRMATION.name, value).apply()
        }

    private enum class Keys {
        REQUIRED_SENTENCES_COUNT,
        PERIODICALLY_REFRESH_SENTENCES,
        ENABLE_RECORDING_SOUND_INDICATOR,
        SKIP_RECORDING_CONFIRMATION
    }

}