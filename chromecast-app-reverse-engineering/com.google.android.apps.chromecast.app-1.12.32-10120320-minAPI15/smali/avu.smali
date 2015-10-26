.class public final Lavu;
.super Lavr;
.source "PG"


# instance fields
.field private final b:Lavv;


# direct methods
.method public constructor <init>(Lavv;)V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lavr;-><init>(I)V

    .line 24
    iput-object p1, p0, Lavu;->b:Lavv;

    .line 25
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lavu;->b:Lavv;

    invoke-interface {v0}, Lavv;->a()V

    .line 39
    return-void
.end method
