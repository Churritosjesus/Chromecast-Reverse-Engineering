.class final Lcid;
.super Lcie;


# instance fields
.field private synthetic a:Landroid/graphics/Bitmap;

.field private synthetic g:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/graphics/Bitmap;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lcid;->a:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcid;->g:Landroid/os/Bundle;

    invoke-direct {p0, p1}, Lcie;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lbwc;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 0
    check-cast p1, Lcky;

    .line 1000
    new-instance v0, Lcif;

    invoke-direct {v0}, Lcif;-><init>()V

    iget-object v1, p0, Lcid;->a:Landroid/graphics/Bitmap;

    .line 2000
    iput-object v1, v0, Lcif;->a:Landroid/graphics/Bitmap;

    .line 1000
    iget-object v1, p0, Lcid;->g:Landroid/os/Bundle;

    .line 3000
    if-eqz v1, :cond_0

    iget-object v2, v0, Lcif;->b:Landroid/os/Bundle;

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 4000
    :cond_0
    new-instance v1, Lcom/google/android/gms/feedback/FeedbackOptions;

    .line 5000
    invoke-direct {v1}, Lcom/google/android/gms/feedback/FeedbackOptions;-><init>()V

    .line 4000
    iget-object v2, v0, Lcif;->a:Landroid/graphics/Bitmap;

    invoke-static {v1, v2}, Lcom/google/android/gms/feedback/FeedbackOptions;->a(Lcom/google/android/gms/feedback/FeedbackOptions;Landroid/graphics/Bitmap;)Lcom/google/android/gms/feedback/FeedbackOptions;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/google/android/gms/feedback/FeedbackOptions;->a(Lcom/google/android/gms/feedback/FeedbackOptions;Ljava/lang/String;)Lcom/google/android/gms/feedback/FeedbackOptions;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/google/android/gms/feedback/FeedbackOptions;->b(Lcom/google/android/gms/feedback/FeedbackOptions;Ljava/lang/String;)Lcom/google/android/gms/feedback/FeedbackOptions;

    move-result-object v1

    iget-object v2, v0, Lcif;->b:Landroid/os/Bundle;

    invoke-static {v1, v2}, Lcom/google/android/gms/feedback/FeedbackOptions;->a(Lcom/google/android/gms/feedback/FeedbackOptions;Landroid/os/Bundle;)Lcom/google/android/gms/feedback/FeedbackOptions;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/google/android/gms/feedback/FeedbackOptions;->c(Lcom/google/android/gms/feedback/FeedbackOptions;Ljava/lang/String;)Lcom/google/android/gms/feedback/FeedbackOptions;

    move-result-object v1

    iget-object v0, v0, Lcif;->c:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lcom/google/android/gms/feedback/FeedbackOptions;->a(Lcom/google/android/gms/feedback/FeedbackOptions;Ljava/util/ArrayList;)Lcom/google/android/gms/feedback/FeedbackOptions;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/feedback/FeedbackOptions;->a(Lcom/google/android/gms/feedback/FeedbackOptions;Z)Lcom/google/android/gms/feedback/FeedbackOptions;

    move-result-object v0

    invoke-static {v0, v3}, Lcom/google/android/gms/feedback/FeedbackOptions;->a(Lcom/google/android/gms/feedback/FeedbackOptions;Lcom/google/android/gms/feedback/ThemeSettings;)Lcom/google/android/gms/feedback/FeedbackOptions;

    move-result-object v0

    invoke-static {v0, v3}, Lcom/google/android/gms/feedback/FeedbackOptions;->a(Lcom/google/android/gms/feedback/FeedbackOptions;Lcom/google/android/gms/feedback/LogOptions;)Lcom/google/android/gms/feedback/FeedbackOptions;

    move-result-object v1

    .line 6000
    invoke-virtual {p1}, Lcky;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lckz;

    .line 7000
    iget-object v2, p1, Lcky;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-static {v1, v2}, Lcky;->a(Lcom/google/android/gms/feedback/FeedbackOptions;Ljava/io/File;)Lcom/google/android/gms/feedback/ErrorReport;

    move-result-object v1

    .line 6000
    invoke-interface {v0, v1}, Lckz;->a(Lcom/google/android/gms/feedback/ErrorReport;)Z

    .line 1000
    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcid;->a(Lbwm;)V

    .line 0
    return-void
.end method
