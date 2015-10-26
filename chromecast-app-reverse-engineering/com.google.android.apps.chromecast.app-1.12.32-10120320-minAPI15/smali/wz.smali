.class public final Lwz;
.super Lww;
.source "PG"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lww;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 26
    new-instance v0, Lxa;

    invoke-direct {v0, p0}, Lxa;-><init>(Lwz;)V

    sput-object v0, Lzv;->b:Lzw;

    .line 34
    return-void
.end method
