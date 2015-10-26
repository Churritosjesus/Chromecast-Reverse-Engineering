.class public final Lot;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static a:[Ljava/lang/Class;

.field private static final b:Ljava/util/Map;


# instance fields
.field private final c:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 57
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Landroid/content/Context;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-class v2, Landroid/util/AttributeSet;

    aput-object v2, v0, v1

    sput-object v0, Lot;->a:[Ljava/lang/Class;

    .line 62
    new-instance v0, Led;

    invoke-direct {v0}, Led;-><init>()V

    sput-object v0, Lot;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lot;->c:[Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Landroid/content/Context;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 168
    sget-object v0, Loq;->cw:[I

    invoke-virtual {p0, p1, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 170
    if-eqz p2, :cond_3

    .line 172
    sget v0, Loq;->cx:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 174
    :goto_0
    if-eqz p3, :cond_2

    if-nez v0, :cond_2

    .line 176
    sget v0, Loq;->cy:I

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    move v1, v0

    .line 183
    :goto_1
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 185
    if-eqz v1, :cond_1

    instance-of v0, p0, Lpi;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lpi;

    .line 1048
    iget v0, v0, Lpi;->a:I

    .line 185
    if-eq v0, v1, :cond_1

    .line 189
    :cond_0
    new-instance v0, Lpi;

    invoke-direct {v0, p0, v1}, Lpi;-><init>(Landroid/content/Context;I)V

    move-object p0, v0

    .line 191
    :cond_1
    return-object p0

    :cond_2
    move v1, v0

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 2

    .prologue
    .line 143
    sget-object v0, Lot;->b:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 146
    if-nez v0, :cond_0

    .line 148
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    if-eqz p3, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 151
    sget-object v1, Lot;->a:[Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 152
    sget-object v1, Lot;->b:Ljava/util/Map;

    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 155
    iget-object v1, p0, Lot;->c:[Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    :goto_1
    return-object v0

    :cond_1
    move-object v0, p2

    .line 148
    goto :goto_0

    .line 159
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 116
    const-string v0, "view"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    const-string v0, "class"

    invoke-interface {p3, v1, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 121
    :cond_0
    :try_start_0
    iget-object v0, p0, Lot;->c:[Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    .line 122
    iget-object v0, p0, Lot;->c:[Ljava/lang/Object;

    const/4 v2, 0x1

    aput-object p3, v0, v2

    .line 124
    const/4 v0, -0x1

    const/16 v2, 0x2e

    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ne v0, v2, :cond_1

    .line 126
    const-string v0, "android.widget."

    invoke-direct {p0, p1, p2, v0}, Lot;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 136
    iget-object v2, p0, Lot;->c:[Ljava/lang/Object;

    aput-object v1, v2, v3

    .line 137
    iget-object v2, p0, Lot;->c:[Ljava/lang/Object;

    aput-object v1, v2, v4

    :goto_0
    return-object v0

    .line 128
    :cond_1
    const/4 v0, 0x0

    :try_start_1
    invoke-direct {p0, p1, p2, v0}, Lot;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 136
    iget-object v2, p0, Lot;->c:[Ljava/lang/Object;

    aput-object v1, v2, v3

    .line 137
    iget-object v2, p0, Lot;->c:[Ljava/lang/Object;

    aput-object v1, v2, v4

    goto :goto_0

    .line 136
    :catch_0
    move-exception v0

    iget-object v0, p0, Lot;->c:[Ljava/lang/Object;

    aput-object v1, v0, v3

    .line 137
    iget-object v0, p0, Lot;->c:[Ljava/lang/Object;

    aput-object v1, v0, v4

    move-object v0, v1

    goto :goto_0

    .line 136
    :catchall_0
    move-exception v0

    iget-object v2, p0, Lot;->c:[Ljava/lang/Object;

    aput-object v1, v2, v3

    .line 137
    iget-object v2, p0, Lot;->c:[Ljava/lang/Object;

    aput-object v1, v2, v4

    throw v0
.end method
