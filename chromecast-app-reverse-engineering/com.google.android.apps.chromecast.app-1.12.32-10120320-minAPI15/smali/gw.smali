.class Lgw;
.super Lgv;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 962
    invoke-direct {p0}, Lgv;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 965
    .line 1023
    invoke-virtual {p1}, Landroid/view/View;->getOverScrollMode()I

    move-result v0

    .line 965
    return v0
.end method
