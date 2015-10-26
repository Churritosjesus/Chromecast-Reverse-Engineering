.class final Ljp;
.super Ljo;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljo;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljn;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 47
    new-instance v0, Ljq;

    invoke-direct {v0, p0, p1}, Ljq;-><init>(Ljp;Ljn;)V

    .line 1038
    new-instance v1, Ljt;

    invoke-direct {v1, v0}, Ljt;-><init>(Lju;)V

    .line 47
    return-object v1
.end method
