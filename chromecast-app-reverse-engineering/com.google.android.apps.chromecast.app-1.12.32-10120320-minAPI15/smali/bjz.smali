.class public final Lbjz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lbjz;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lbjz;->a:Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;->f(Lcom/google/android/apps/chromecast/app/tutorial/TutorialOtaActivity;)V

    .line 143
    const/4 v0, 0x0

    return v0
.end method
