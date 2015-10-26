.class final Ldhh;
.super Ldge;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Ldge;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .prologue
    .line 107
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final c()Ldkd;
    .locals 1

    .prologue
    .line 110
    new-instance v0, Ldjz;

    invoke-direct {v0}, Ldjz;-><init>()V

    return-object v0
.end method
