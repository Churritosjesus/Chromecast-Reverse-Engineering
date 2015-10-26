.class public final Lczx;
.super Ldah;
.source "PG"


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)V
    .locals 0

    .prologue
    .line 899
    invoke-direct {p0, p1, p2}, Ldah;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)V

    .line 900
    return-void
.end method


# virtual methods
.method final a(F)Z
    .locals 1

    .prologue
    .line 903
    iget v0, p0, Lczx;->a:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
