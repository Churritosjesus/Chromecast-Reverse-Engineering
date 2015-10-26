.class public final Ldgb;
.super Ldga;
.source "PG"


# instance fields
.field private synthetic a:I

.field private synthetic b:[B

.field private synthetic c:I


# direct methods
.method public constructor <init>(Ldfs;I[BI)V
    .locals 0

    .prologue
    .line 86
    iput p2, p0, Ldgb;->a:I

    iput-object p3, p0, Ldgb;->b:[B

    iput p4, p0, Ldgb;->c:I

    invoke-direct {p0}, Ldga;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .prologue
    .line 92
    iget v0, p0, Ldgb;->a:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final a(Ldkc;)V
    .locals 3

    .prologue
    .line 96
    iget-object v0, p0, Ldgb;->b:[B

    iget v1, p0, Ldgb;->c:I

    iget v2, p0, Ldgb;->a:I

    invoke-interface {p1, v0, v1, v2}, Ldkc;->c([BII)Ldkc;

    .line 97
    return-void
.end method
