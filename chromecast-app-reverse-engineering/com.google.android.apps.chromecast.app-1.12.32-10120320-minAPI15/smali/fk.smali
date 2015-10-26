.class final Lfk;
.super Lfj;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 144
    invoke-direct {p0}, Lfj;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 147
    .line 1026
    invoke-static {p1}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v0

    .line 147
    return v0
.end method

.method public final a(II)Z
    .locals 1

    .prologue
    .line 152
    .line 1030
    invoke-static {p1, p2}, Landroid/view/KeyEvent;->metaStateHasModifiers(II)Z

    move-result v0

    .line 152
    return v0
.end method

.method public final b(I)Z
    .locals 1

    .prologue
    .line 157
    .line 1034
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result v0

    .line 157
    return v0
.end method
