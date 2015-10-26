.class public final Lbjy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lbjy;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lbjy;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->d(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbjy;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    iget-object v0, p0, Lbjy;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->e(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Layq;

    move-result-object v0

    invoke-virtual {v0}, Layq;->c()V

    .line 77
    iget-object v0, p0, Lbjy;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->a(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;Z)V

    goto :goto_0
.end method
