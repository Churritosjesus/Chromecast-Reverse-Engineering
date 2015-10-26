.class public final Ladw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladx;


# instance fields
.field private synthetic a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ladv;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 214
    iput-object p2, p0, Ladw;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lads;)Z
    .locals 2

    .prologue
    .line 217
    .line 1163
    iget-object v0, p1, Lads;->k:Ljava/lang/Object;

    .line 217
    iget-object v1, p0, Ladw;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
