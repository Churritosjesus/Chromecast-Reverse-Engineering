.class public final Ljm;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Ljm;->a:Ljava/lang/Object;

    .line 130
    return-void
.end method

.method public static a(IIIIZZ)Ljm;
    .locals 8

    .prologue
    .line 124
    new-instance v7, Ljm;

    invoke-static {}, Ljd;->k()Ljh;

    move-result-object v0

    const/4 v6, 0x0

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v6}, Ljh;->a(IIIIZZ)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v7, v0}, Ljm;-><init>(Ljava/lang/Object;)V

    return-object v7
.end method
