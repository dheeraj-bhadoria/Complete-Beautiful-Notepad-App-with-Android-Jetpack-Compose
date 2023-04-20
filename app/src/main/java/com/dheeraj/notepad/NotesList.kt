package com.dheeraj.notepad

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NotesList(notesList: List<Note>) {
    LazyColumn {
        items(notesList) { note ->
            Text(text = "Title: ${note.title}")
            Text(text = "Description: ${note.description}")
            Divider(modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}
