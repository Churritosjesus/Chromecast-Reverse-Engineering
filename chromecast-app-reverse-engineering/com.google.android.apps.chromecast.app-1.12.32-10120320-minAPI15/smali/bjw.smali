.class public final Lbjw;
.super Landroid/animation/AnimatorListenerAdapter;
.source "PG"


# instance fields
.field private synthetic a:Z

.field private synthetic b:Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;Z)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lbjw;->b:Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;

    iput-boolean p2, p0, Lbjw;->a:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 226
    iget-object v0, p0, Lbjw;->b:Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->a(Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;)Landroid/animation/Animator;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 227
    iget-object v0, p0, Lbjw;->b:Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->a(Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 228
    iget-boolean v0, p0, Lbjw;->a:Z

    if-nez v0, :cond_0

    .line 229
    iget-object v0, p0, Lbjw;->b:Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;

    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialActivity;->g:Landroid/widget/Button;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 232
    :cond_0
    return-void
.end method
