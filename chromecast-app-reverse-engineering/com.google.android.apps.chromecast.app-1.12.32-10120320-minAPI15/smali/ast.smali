.class public final Last;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J


# direct methods
.method public constructor <init>(Ldbr;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iget-object v0, p1, Ldbr;->a:Ljava/lang/String;

    iput-object v0, p0, Last;->a:Ljava/lang/String;

    .line 34
    iget-object v0, p1, Ldbr;->b:Ljava/lang/String;

    iput-object v0, p0, Last;->b:Ljava/lang/String;

    .line 35
    iget-object v0, p1, Ldbr;->c:Ljava/lang/String;

    iput-object v0, p0, Last;->c:Ljava/lang/String;

    .line 36
    iget-object v0, p1, Ldbr;->d:Ljava/lang/Long;

    if-nez v0, :cond_0

    .line 37
    const-wide/16 v0, 0x0

    :goto_0
    iput-wide v0, p0, Last;->d:J

    .line 38
    return-void

    .line 37
    :cond_0
    iget-object v0, p1, Ldbr;->d:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0
.end method

.method public constructor <init>(Ldbt;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p2, p0, Last;->a:Ljava/lang/String;

    .line 45
    iget-object v0, p1, Ldbt;->a:Ljava/lang/String;

    iput-object v0, p0, Last;->b:Ljava/lang/String;

    .line 46
    iget-object v0, p1, Ldbt;->b:Ljava/lang/String;

    iput-object v0, p0, Last;->c:Ljava/lang/String;

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Last;->d:J

    .line 48
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 111
    .line 1074
    iget-object v0, p0, Last;->c:Ljava/lang/String;

    .line 111
    return-object v0
.end method
