.class public final Lvd;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lvd;->c:I

    .line 76
    const/4 v0, 0x3

    iput v0, p0, Lvd;->d:I

    .line 77
    return-void
.end method
