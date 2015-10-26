.class public final Lbjx;
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
    .line 58
    iput-object p1, p0, Lbjx;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 61
    iget-object v0, p0, Lbjx;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->f:Landroid/support/v4/view/ViewPager;

    .line 1509
    iget v0, v0, Landroid/support/v4/view/ViewPager;->b:I

    .line 61
    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lbjx;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->e:Lbkb;

    .line 2031
    iget-object v1, v1, Lbkb;->b:[Ldap;

    array-length v1, v1

    .line 61
    rem-int/2addr v0, v1

    .line 62
    iget-object v1, p0, Lbjx;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->f:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 63
    iget-object v0, p0, Lbjx;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->c(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lbjx;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->a(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object v2, p0, Lbjx;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-static {v2}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->b(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 64
    return-void
.end method
