.class public final Lalf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/DebugActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/DebugActivity;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lalf;->a:Lcom/google/android/apps/chromecast/app/DebugActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 68
    iget-object v1, p0, Lalf;->a:Lcom/google/android/apps/chromecast/app/DebugActivity;

    sget-object v0, Lbld;->a:Ljava/util/List;

    .line 69
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 68
    invoke-static {v1, v0}, La;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 70
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->j()V

    .line 71
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 2

    .prologue
    .line 75
    iget-object v0, p0, Lalf;->a:Lcom/google/android/apps/chromecast/app/DebugActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 76
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->j()V

    .line 77
    return-void
.end method
