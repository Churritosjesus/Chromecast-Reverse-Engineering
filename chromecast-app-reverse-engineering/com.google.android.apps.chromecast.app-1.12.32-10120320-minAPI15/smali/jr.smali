.class final Ljr;
.super Ljo;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0}, Ljo;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljn;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 88
    new-instance v0, Ljs;

    invoke-direct {v0, p0, p1}, Ljs;-><init>(Ljr;Ljn;)V

    .line 1039
    new-instance v1, Ljv;

    invoke-direct {v1, v0}, Ljv;-><init>(Ljw;)V

    .line 88
    return-object v1
.end method
