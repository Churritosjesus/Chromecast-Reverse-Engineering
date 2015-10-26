.class public final Lbka;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Layw;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)V
    .locals 0

    .prologue
    .line 236
    iput-object p1, p0, Lbka;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 239
    return-void
.end method

.method public final a(Laym;)V
    .locals 2

    .prologue
    .line 245
    .line 1066
    iget-object v0, p1, Laym;->a:Ljava/lang/String;

    .line 245
    iget-object v1, p0, Lbka;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->g(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, p0, Lbka;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->c(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lbka;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->h(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 248
    iget-object v0, p0, Lbka;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->e(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Layq;

    move-result-object v0

    invoke-virtual {v0}, Layq;->c()V

    .line 249
    iget-object v0, p0, Lbka;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->a(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;Z)V

    .line 251
    :cond_0
    return-void
.end method

.method public final b(Laym;)V
    .locals 0

    .prologue
    .line 255
    return-void
.end method
