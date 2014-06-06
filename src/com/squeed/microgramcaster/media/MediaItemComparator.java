package com.squeed.microgramcaster.media;

import java.util.Comparator;

public class MediaItemComparator implements Comparator<MediaItem> {

	@Override
	public int compare(MediaItem lhs, MediaItem rhs) {
		return lhs.getName().compareTo(rhs.getName());
	}

}