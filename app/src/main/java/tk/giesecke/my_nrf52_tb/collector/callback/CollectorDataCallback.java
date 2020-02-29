package tk.giesecke.my_nrf52_tb.collector.callback;

import android.bluetooth.BluetoothDevice;

import androidx.annotation.NonNull;
import no.nordicsemi.android.ble.callback.profile.ProfileDataCallback;
import no.nordicsemi.android.ble.data.Data;

/**
 * This is a sample data callback, that's based on Heart Rate Measurement characteristic.
 * It parses the HR value and ignores other optional data for simplicity.
 * Check {@link no.nordicsemi.android.ble.common.callback.hr.HeartRateMeasurementDataCallback}
 * for full implementation.
 *
 * TODO Modify the content to parse your data.
 */
public abstract class CollectorDataCallback implements ProfileDataCallback, CollectorCharacteristicCallback {

	@Override
	public void onDataReceived(@NonNull final BluetoothDevice device, @NonNull final Data data) {
		// Report the parsed value(s)
		onSampleValueReceived(device, data);
	}
}
