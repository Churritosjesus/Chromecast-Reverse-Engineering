.class public final Lalg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field private synthetic a:Landroid/widget/Spinner;

.field private synthetic b:Lcom/google/android/apps/chromecast/app/DebugActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/DebugActivity;Landroid/widget/Spinner;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lalg;->b:Lcom/google/android/apps/chromecast/app/DebugActivity;

    iput-object p2, p0, Lalg;->a:Landroid/widget/Spinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 101
    iget-object v0, p0, Lalg;->a:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblm;

    .line 1265
    iget-object v0, v0, Lblm;->a:Ljava/lang/String;

    .line 102
    iget-object v1, p0, Lalg;->b:Lcom/google/android/apps/chromecast/app/DebugActivity;

    invoke-static {v1, v0}, La;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 103
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->j()V

    .line 104
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 2

    .prologue
    .line 108
    iget-object v0, p0, Lalg;->b:Lcom/google/android/apps/chromecast/app/DebugActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 109
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->j()V

    .line 110
    return-void
.end method
