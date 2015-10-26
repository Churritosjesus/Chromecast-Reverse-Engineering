.class final Lboi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbof;


# instance fields
.field a:[I

.field b:[I


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 191
    iget-object v0, p0, Lboi;->a:[I

    iget-object v1, p0, Lboi;->a:[I

    array-length v1, v1

    rem-int v1, p1, v1

    aget v0, v0, v1

    return v0
.end method

.method public final b(I)I
    .locals 2

    .prologue
    .line 196
    iget-object v0, p0, Lboi;->b:[I

    iget-object v1, p0, Lboi;->b:[I

    array-length v1, v1

    rem-int v1, p1, v1

    aget v0, v0, v1

    return v0
.end method
