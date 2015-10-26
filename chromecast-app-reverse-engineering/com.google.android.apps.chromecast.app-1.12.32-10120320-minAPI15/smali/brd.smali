.class public final Lbrd;
.super Ljava/lang/Object;


# instance fields
.field final a:Landroid/content/Context;

.field final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Application context can\'t be null"

    invoke-static {v0, v1}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lbrd;->a:Landroid/content/Context;

    iput-object v0, p0, Lbrd;->b:Landroid/content/Context;

    return-void
.end method

.method protected static a(Lbrb;)Lbrt;
    .locals 1

    new-instance v0, Lbrt;

    invoke-direct {v0, p0}, Lbrt;-><init>(Lbrb;)V

    return-object v0
.end method

.method protected static b(Lbrb;)Lbrz;
    .locals 1

    new-instance v0, Lbrz;

    invoke-direct {v0, p0}, Lbrz;-><init>(Lbrb;)V

    return-object v0
.end method

.method public static d(Lbrb;)Lbrf;
    .locals 1

    new-instance v0, Lbrf;

    invoke-direct {v0, p0}, Lbrf;-><init>(Lbrb;)V

    return-object v0
.end method

.method public static e(Lbrb;)Lbse;
    .locals 1

    new-instance v0, Lbse;

    invoke-direct {v0, p0}, Lbse;-><init>(Lbrb;)V

    return-object v0
.end method

.method public static f(Lbrb;)Lbqp;
    .locals 1

    new-instance v0, Lbqp;

    invoke-direct {v0, p0}, Lbqp;-><init>(Lbrb;)V

    return-object v0
.end method


# virtual methods
.method final c(Lbrb;)Lbrn;
    .locals 1

    new-instance v0, Lbrn;

    invoke-direct {v0, p1, p0}, Lbrn;-><init>(Lbrb;Lbrd;)V

    return-object v0
.end method
