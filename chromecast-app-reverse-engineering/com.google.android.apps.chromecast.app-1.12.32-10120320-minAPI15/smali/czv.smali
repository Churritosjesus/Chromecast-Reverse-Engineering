.class public final Lczv;
.super Landroid/animation/AnimatorListenerAdapter;
.source "PG"


# instance fields
.field private synthetic a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V
    .locals 0

    .prologue
    .line 599
    iput-object p1, p0, Lczv;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 610
    iget-object v0, p0, Lczv;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;Z)Z

    .line 611
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 604
    iget-object v0, p0, Lczv;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;Z)Z

    .line 605
    return-void
.end method
