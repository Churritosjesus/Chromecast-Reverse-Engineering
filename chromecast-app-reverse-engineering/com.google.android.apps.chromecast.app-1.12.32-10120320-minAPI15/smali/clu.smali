.class public final Lclu;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lclt;
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 0
    new-instance v0, Lclt;

    .line 1000
    invoke-direct {v0, v1, v1, v2, v2}, Lclt;-><init>(ZZLjava/lang/String;Ls;)V

    .line 0
    return-object v0
.end method
