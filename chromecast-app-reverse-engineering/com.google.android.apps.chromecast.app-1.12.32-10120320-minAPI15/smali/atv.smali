.class public final Latv;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:I

.field public b:D


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 321
    const/4 v0, 0x0

    iput v0, p0, Latv;->a:I

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 329
    iget v0, p0, Latv;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Z
    .locals 2

    .prologue
    .line 337
    iget v0, p0, Latv;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
