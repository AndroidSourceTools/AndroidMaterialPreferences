/*
 * Copyright 2014 - 2018 Michael Rapp
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package de.mrapp.android.preference;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import android.util.AttributeSet;

import de.mrapp.android.dialog.MaterialDialog;
import de.mrapp.android.preference.view.NumberPicker;

/**
 * An implementation of the class {@link AbstractNumberPickerPreference}, which is needed for test
 * purposes.
 *
 * @author Michael Rapp
 */
public class AbstractNumberPickerPreferenceImplementation extends AbstractNumberPickerPreference {

    /**
     * Creates a new preference, which allows to choose a decimal number via a {@link NumberPicker}
     * widget.
     *
     * @param context
     *         The context, which should be used by the preference, as an instance of the class
     *         {@link Context}
     */
    public AbstractNumberPickerPreferenceImplementation(final Context context) {
        super(context);
    }

    /**
     * Creates a new preference, which allows to choose a decimal number via a {@link NumberPicker}
     * widget.
     *
     * @param context
     *         The context, which should be used by the preference, as an instance of the class
     *         {@link Context}
     * @param attributeSet
     *         The attributes of the XML tag that is inflating the preference, as an instance of the
     *         type {@link AttributeSet}
     */
    public AbstractNumberPickerPreferenceImplementation(final Context context,
                                                        final AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /**
     * Creates a new preference, which allows to choose a decimal number via a {@link NumberPicker}
     * widget.
     *
     * @param context
     *         The context, which should be used by the preference, as an instance of the class
     *         {@link Context}
     * @param attributeSet
     *         The attributes of the XML tag that is inflating the preference, as an instance of the
     *         type {@link AttributeSet}
     * @param defaultStyle
     *         The default style to apply to this preference. If 0, no style will be applied (beyond
     *         what is included in the theme). This may either be an attribute resource, whose value
     *         will be retrieved from the current theme, or an explicit style resource
     */
    public AbstractNumberPickerPreferenceImplementation(final Context context,
                                                        final AttributeSet attributeSet,
                                                        final int defaultStyle) {
        super(context, attributeSet, defaultStyle);
    }

    /**
     * Creates a new preference, which allows to choose a decimal number via a {@link NumberPicker}
     * widget.
     *
     * @param context
     *         The context, which should be used by the preference, as an instance of the class
     *         {@link Context}
     * @param attributeSet
     *         The attributes of the XML tag that is inflating the preference, as an instance of the
     *         type {@link AttributeSet}
     * @param defaultStyle
     *         The default style to apply to this preference. If 0, no style will be applied (beyond
     *         what is included in the theme). This may either be an attribute resource, whose value
     *         will be retrieved from the current theme, or an explicit style resource
     * @param defaultStyleResource
     *         A resource identifier of a style resource that supplies default values for the
     *         preference, used only if the default style is 0 or can not be found in the theme. Can
     *         be 0 to not look for defaults
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public AbstractNumberPickerPreferenceImplementation(final Context context,
                                                        final AttributeSet attributeSet,
                                                        final int defaultStyle,
                                                        final int defaultStyleResource) {
        super(context, attributeSet, defaultStyle, defaultStyleResource);
    }

    @Override
    protected final void onPrepareDialog(@NonNull final MaterialDialog.Builder dialogBuilder) {

    }

    @Override
    protected final void onDialogClosed(final boolean positiveResult) {

    }

}