.class final Ldae;
.super Landroid/animation/AnimatorListenerAdapter;
.source "PG"


# instance fields
.field private synthetic a:Ldac;


# direct methods
.method constructor <init>(Ldac;Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V
    .locals 0

    .prologue
    .line 855
    iput-object p1, p0, Ldae;->a:Ldac;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .prologue
    .line 858
    iget-object v0, p0, Ldae;->a:Ldac;

    iget-object v0, v0, Ldac;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    iget-object v1, p0, Ldae;->a:Ldac;

    invoke-static {v1}, Ldac;->a(Ldac;)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;IF)V

    .line 859
    iget-object v0, p0, Ldae;->a:Ldac;

    iget-object v0, v0, Ldac;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-virtual {v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->postInvalidateOnAnimation()V

    .line 860
    return-void
.end method
