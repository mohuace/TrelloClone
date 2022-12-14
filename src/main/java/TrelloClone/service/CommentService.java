package TrelloClone.service;

import TrelloClone.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentsByTaskId(Long taskId);
    Comment getCommentByCommentId(Long commentId);

    Comment createComment(Long taskId, Comment comment);
}
